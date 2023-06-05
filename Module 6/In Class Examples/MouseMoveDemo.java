import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.geometry.Pos;

/**
 * This program was made by Justin Frock on April 10th 2023 for CIS232
 * This program us a Mouse Moving Demo
 */


public class MouseMoveDemo extends Application {
    public static void main(String[] args){
        //Launch the application
        launch(args);

    }
    @Override
    public void start(Stage primaryStage){
        //Constants for Scene Size
        final double SCENE_WIDTH = 200.0;
        final double SCENE_HEIGHT = 200.0;

        //Create a Label
        Label label = new Label("Move the Mouse");

        //Add the label to pane
        HBox hbox = new HBox(label);
        hbox.setAlignment((Pos.CENTER));

        //Create the Scene
        Scene scene = new Scene(hbox,SCENE_WIDTH,SCENE_HEIGHT);

        //Register an event handler
        //the MOUSE MOVED event
        scene.setOnMouseMoved(event ->
        {
            //Get Mouse Coordinates
            double x = event.getSceneX();
            double y = event.getSceneY();

            //Display the mouse Cursors location
            label.setText(String.format("%.0f,%.0f",x,y));
        });
        //Set scene to stage and display it
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
