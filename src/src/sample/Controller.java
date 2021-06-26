package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.File;

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
    File file;
    @FXML
    void filesOpen(ActionEvent event) {

        file = fil_chooser.showOpenDialog(sample.Main.primaryStage);
        System.out.println(file);
    }

}
