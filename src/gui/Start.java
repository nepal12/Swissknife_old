/**
 * Created by ritz_ on 10.11.2016.
 */
package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Start extends Application{

    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/Start.fxml"));
        stage.setTitle("Swiss Knife");
        Scene scene = new Scene(root);
       // scene.getStylesheets().add(getClass().getResource("../resource/main.css").toExternalForm());
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }


}
