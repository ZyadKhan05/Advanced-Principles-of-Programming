import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.*;
import java.io.*;
import javafx.scene.input.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.layout.Pane;
import javafx.scene.input.KeyCode;


public class ex1 extends Application{
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        // Constants for the scene size
        final double SCENE_WIDTH = 200.0;
        final double SCENE_HEIGHT = 200.0;

        // Constants for the ball
        final double CENTER_X = 100.0, CENTER_Y = 100.0;
        final double RADIUS = 40.0;

        // Create the ball
        Circle circle = new Circle(CENTER_X, CENTER_Y, RADIUS);

        // Register an event handler for the MOUSE_DRAGEED event
        circle.setOnMouseDragged(event -> {
            // Get the mouse cursor's coordinates
            double x = event.getSceneX();
            double y = event.getSceneY();

            // Move the circle
            circle.setCenterX(x);
            circle.setCenterY(y);
        });
        Pane pane = new Pane(circle);

        // Create a scene and display
        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
