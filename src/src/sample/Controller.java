package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
public class Controller {

    @FXML
    private Button btn;

    @FXML
    private Label lb2;

    @FXML
    private Label lb1;

    @FXML
    private TextField tf3;


    @FXML
    void pressButton(ActionEvent event) {
        System.out.println("Checkpoint");
        //lb2.setText("<List of names>");
        System.out.println(tf3.getText());
        String checker=tf3.getText();
        if(ocr_text==null){
            lb2.setText("Error: Input a File");
        }
        if(ocr_text.contains(checker)==true){
            lb2.setText("Eligible");
        }
        else
        {
            lb2.setText("Not Eligible");
        }


    }
    FileChooser fil_chooser = new FileChooser();

    String ocr_text;
    @FXML
    void filesOpen(ActionEvent event) throws IOException {

        File filee = fil_chooser.showOpenDialog(sample.Main.primaryStage);
        System.out.println(filee);
        try {
            File pdf_file=new File(String.valueOf(filee.getAbsoluteFile()));
            PDDocument document=PDDocument.load(pdf_file);
            PDFTextStripper pdfstripper= new PDFTextStripper();
            ocr_text=pdfstripper.getText(document);
            System.out.println(ocr_text);
        } catch (Exception e) {
            System.out.println(e);

        }

    }

}
