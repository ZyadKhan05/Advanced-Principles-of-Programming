import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.*;
import java.io.*;
import javafx.scene.input.*;


// This program demonstrates the password tool on javafx
public class pressKey extends Application {
    private int count = 0; // Keep count of key presses

    public void start(Stage primaryStage){
        // create a label control
        Label label = new Label("0");

        // put the label in hbox
        HBox hbox = new HBox(10,label);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(10));

        // Create a scene with the Hbox as its root node
        Scene scene = new Scene(hbox);

        // Register a Key_Pressed Handler for the scene
        scene.setOnKeyPressed(event -> {
            count ++;
            label.setText(String.format("%d",count));
        });
        // Set scene and display
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        launch();
    }
}