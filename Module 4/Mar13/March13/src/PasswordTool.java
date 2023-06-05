import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;

// This program demonstrates the password tool on javafx
public class PasswordTool extends Application{
    // Launch the application
    public void start(Stage stage){
       // title set
        stage.setTitle("Enter your password Page: ");

        // create a password field
        PasswordField password = new PasswordField();

        // Create a tile pane
        TilePane Tile = new TilePane();

        // add the password field
        Tile.getChildren().add(password);

        // Create the password scene
        Scene scene = new Scene(Tile, 100, 100);

        // set and show scene
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args){
        launch(args);
    }
}
