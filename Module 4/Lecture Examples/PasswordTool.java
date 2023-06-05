import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * Made by Justin Frock for CIS232 on March 13th 2023
 * This program demonstrates the password tool on JavaFX
 */

public class PasswordTool extends Application {
    //Launch the application
    public void start( Stage stage){
        //title set
        stage.setTitle("Enter your Password Page");

        //create password field
        PasswordField password = new PasswordField();

        //create tile pane
        TilePane Tile = new TilePane();

        //add password field
        Tile.getChildren().add(password);

        //Creating the password scene
        Scene scene = new Scene(Tile, 100, 100);

        //set and show scene
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        //launch the application
        launch(args);
    }
}
