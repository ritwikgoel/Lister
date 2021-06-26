package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    static Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setWidth(686.0);
        primaryStage.setHeight(495.0);
        primaryStage.setTitle("Lister");

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
