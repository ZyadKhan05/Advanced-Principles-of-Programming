// Import the required Javafx controls
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class MouseMoveDemo extends Application{
    public static void main(String args[]){
        // launch the application
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        // Constants for scene size
        final double SCENE_WIDTH = 200.0;
        final double SCENE_HEIGHT = 200.0;

        // Create a label
        Label label = new Label("Move the Mouse");

        // Add label to pane
        HBox hbox = new HBox(label);
        hbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(hbox, SCENE_WIDTH, SCENE_HEIGHT);

        // Register event handler
        scene.setOnMouseMoved(event -> {
            // Get mouse coordinates
            double x = event.getSceneX();
            double y = event.getSceneY();

            // Display mouse cursors location
            label.setText(String.format("%.0f,%.0f", x, y));
        });
        // Set scene and display
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
