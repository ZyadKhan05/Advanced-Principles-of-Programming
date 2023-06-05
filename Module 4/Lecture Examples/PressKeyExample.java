import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;

/**
 * Made By Justin Frock for CIS232 on March 13th 2023
 */
public class PressKeyExample extends Application {
    private int count = 0; // To keep count of key presses

    public void start(Stage primaryStage){
        //Create a Label control
        Label label = new Label("0");

        //Put the label into a Hbox
        HBox hbox = new HBox (10, label);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding( new Insets(10));

        //Create a Scene with the Hbox as its root node
        Scene scene = new Scene(hbox);

        // Register a Key_Pressed handler for the scene
        scene.setOnKeyPressed(event -> {
            count ++;
            label.setText(String.format("%d", count));
        });

        //Set the scene on the stage and display it.
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        //Launch the program
        launch();
    }
}
