import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.*;
import java.net.*;

/**
 * Made by Justin Frock for CIS232 on March 13th 2023
 * This program demonstrates the password tool on JavaFX
 */

public class ProgressBar extends Application {
    static double p = 0;
    //Launch the application
    public void start(Stage stage){
        //title set
        stage.setTitle("Progress Bar Page");

        //create progress bar object
        javafx.scene.control.ProgressBar bar = new javafx.scene.control.ProgressBar();

        //create tile pane
        TilePane Tile = new TilePane();

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                p += 0.2;
            }
        };
        // Create a Button
        Button button = new Button("Click for more progress");
        button.setOnAction(event);

        //add progress and button
        Tile.getChildren().add(bar);
        Tile.getChildren().add(button);

        //Creating the password scene
        Scene scene = new Scene(Tile, 300, 300);

        //set and show scene
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        //launch the application
        launch(args);
    }
}
