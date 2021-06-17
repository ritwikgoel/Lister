package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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

}
