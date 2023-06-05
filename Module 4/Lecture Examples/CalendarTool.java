import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import java.time.LocalDate;

/**
 * Made by Justin Frock for CIS232 on March 13th 2023
 * This program demonstrates the password tool on JavaFX
 */

public class CalendarTool extends Application {
    //Launch the application
    public void start(Stage stage){
        //title set
        stage.setTitle("Pick a Date Page");

        //create caledar date picker
       DatePicker date = new DatePicker();

        //create tile pane
        TilePane Tile = new TilePane();

        //add password field
        Tile.getChildren().add(date);

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
