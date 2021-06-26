package sample;

import com.spire.pdf.PdfDocument;
import com.spire.pdf.PdfPageBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {

    @FXML
    private Button btn;

    @FXML
    private Label lb2;

    @FXML
    private Label lb1;

    @FXML
    void pressButton(ActionEvent event) {
        System.out.println("Checkpoint");
        lb2.setText("<List of names>");

    }
    FileChooser fil_chooser = new FileChooser();


    @FXML
    void filesOpen(ActionEvent event) throws IOException {

        File filee = fil_chooser.showOpenDialog(sample.Main.primaryStage);
        System.out.println(filee);

    }

}
