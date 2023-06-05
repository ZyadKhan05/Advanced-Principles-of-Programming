import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * Justin Frock CIS-132 March 8th
 * Demo to use an image as a button
 */

public class image_button extends Application {

    //Launch Application
    public void start(Stage s) {
        s.setTitle("Creating Buttons with images!");

        // Select the file to use for the button
        Image i = new Image("cats.jpg");
        ImageView iw = new ImageView(i);

        //Create our button object
        Button b = new Button( "",iw);

        // Create Pane
        TilePane t = new TilePane();

        //Create the Label
        Label l = new Label("Click the cat to make it speak");

        //Create an event handler
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                l.setText("Meow!");
            }

        };
        //Set the event for button "b"
        b.setOnAction(event);

        //get children
        t.getChildren().add(b);
        t.getChildren().add(l);

        //Create scene
        Scene sc = new Scene(t, 300, 300);

        //Set and show scene
        s.setScene(sc);
        s.show();
    }
    public static void main(String[] args){
        //Start the application
        launch(args);
    }
}
