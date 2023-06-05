import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.ProgressBar;
import java.io.*;

// This program demonstrates the password tool on javafx
public class progressBar extends Application {
    static double progress = 0;
    // Launch the application
    public void start(Stage stage){
        // title set
        stage.setTitle("Progress Bar Page");

        // create a progress bar object
        ProgressBar bar = new ProgressBar();

        // Create a tile pane
        TilePane Tile = new TilePane();

        EventHandler<ActionEvent> event= new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                progress = 0.2;
            }
        };

        // Create a button
        Button button = new Button("Click for more progress");

        button.setOnAction(event);

        // add the password field
        Tile.getChildren().add(bar);
        Tile.getChildren().add(button);

        // Create the password scene
        Scene scene = new Scene(Tile, 300, 300);

        // set and show scene
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args){
        launch(args);
    }
}
