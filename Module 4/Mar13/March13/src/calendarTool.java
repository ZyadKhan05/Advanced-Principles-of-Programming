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
import javafx.scene.*;

// This program demonstrates the password tool on javafx
public class calendarTool extends Application{
    // Launch the application
    public void start(Stage stage){
        // title set
        stage.setTitle("Pick a Date Page: ");

        // create a calendar date picker
        DatePicker date = new DatePicker();

        // Create a tile pane
        TilePane Tile = new TilePane();

        // add the password field
        Tile.getChildren().add(date);

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
