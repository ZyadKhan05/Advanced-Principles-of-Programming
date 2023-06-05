import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;


// Button Demo
public class ButtonDemo extends Application {
    public static void main(String[] args){
        // Launch the application
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        // Label Control
        Label myLabel = new Label("Click the button to display a message");

        // Create the button control
        Button myButton = new Button("Click Here");

        // Put Label and Button in a VBox with 10 pixels of spacing.
        VBox vbox = new VBox(10, myLabel, myButton);

        // Set scene
        Scene scene = new Scene(vbox, 300, 100);

        // Set the scene alignment
        vbox.setAlignment(Pos.CENTER);

        // Add the scene to the stage
        primaryStage.setScene(scene);



        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                myLabel.setText("Button was clicked");
            }
        };

        // Set title
        primaryStage.setTitle("Button Demo");

        myButton.setOnAction(event);

        // Show the window
        primaryStage.show();
    }
}
