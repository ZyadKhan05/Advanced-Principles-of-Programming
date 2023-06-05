import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

// This program was written by Zyad Khan for CIS-232-01 Assignment #4 on 3/6/23
// The purpose of this program is to use JavaFX to create an application that has three buttons: Green, Yellow, and Red lights.
// The user can click on each button to have a message that is displayed to the user.

public class Problem1 extends Application {
    public static void main(String[] args){
        // Display the purpose to the user
        System.out.println("The purpose of this program is to use JavaFX to create an application that has three buttons: Green, Yellow, and Red lights.");
        System.out.println("The user can click on each button to have a message that is displayed to the user.");
        // Launch the application
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        // Label Control
        Label myLabel = new Label("");

        // Image elements for the button images
        Image green = new Image("img_2.png");
        ImageView greenView = new ImageView(green);
        greenView.setFitHeight(50);
        greenView.setFitWidth(50);

        Image yellow = new Image("img_3.png");
        ImageView yellowView = new ImageView(yellow);
        yellowView.setFitHeight(50);
        yellowView.setFitWidth(50);

        Image red = new Image("img_4.png");
        ImageView redView = new ImageView(red);
        redView.setFitHeight(50);
        redView.setFitWidth(50);

        // Create the button controls
        Button greenButton = new Button();
        greenButton.setGraphic(greenView);

        Button yellowButton = new Button();
        yellowButton.setGraphic(yellowView);

        Button redButton = new Button();
        redButton.setGraphic(redView);


        // Put Label and Button in a VBox with 10 pixels of spacing.
        VBox vbox = new VBox(10, myLabel, greenButton, yellowButton, redButton);

        // Set scene
        Scene scene = new Scene(vbox, 300, 400);

        // Set the scene alignment
        vbox.setAlignment(Pos.CENTER);

        // Action Events for each of the events
        EventHandler<ActionEvent> yellowEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                myLabel.setText("Slow Down! Walk! Anyone Running Loses.");
                System.out.println("Yellow button selected");
            }
        };
        EventHandler<ActionEvent> greenEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                myLabel.setText("Go! Go! You may Walk or Run to the Finish Line.");
                System.out.println("Green button selected");
            }
        };
        EventHandler<ActionEvent> redEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                myLabel.setText("Stop! Freeze! Anyone moving Loses.");
                System.out.println("Red button selected");;
            }
        };

        // Add event options to the three buttons
        greenButton.setOnAction(greenEvent);
        yellowButton.setOnAction(yellowEvent);
        redButton.setOnAction(redEvent);

        // Set title
        primaryStage.setTitle("Stop Light");

        // Add the scene to the stage
        primaryStage.setScene(scene);

        // Show the window
        primaryStage.show();
    }
}
