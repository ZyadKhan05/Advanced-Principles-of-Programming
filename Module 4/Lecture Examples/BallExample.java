import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.input.KeyCode;


public class BallExample extends Application {

    public static void main(String[] args){
        //Launch the program
        launch(args);
    }

    public void start(Stage primaryStage){
        // Constants for the scene size
        final double START_X = 100.0, START_Y = 40.0;
        final double RADIUS = 40.0;
        final double STEP = 10.0;

        // Create the ball
        Circle ball = new Circle(START_X, START_Y, RADIUS);

        Pane pane = new Pane(ball);

        // Create a scene for display
        Scene scene = new Scene(pane, 200, 200);

        // Register a KEY_PRESSED handler for the scene
        scene.setOnKeyPressed(event -> {
            //Get the ball's coordinates
            double x = ball.getCenterX();
            double y = ball.getCenterY();
            //check for the down arrow
            if (event.getCode() == KeyCode.DOWN && y < 200 - RADIUS)
            {
                ball.setCenterY(y + STEP);
            }
            // Check for the up arrow
            if (event.getCode() == KeyCode.UP && y >  RADIUS)
            {
                ball.setCenterY(y - STEP);
            }
            //Check for right arrow
            if (event.getCode() == KeyCode.RIGHT && x < 200 - RADIUS)
            {
                ball.setCenterX(x + STEP);
            }
            // check for left arrow
            if (event.getCode() == KeyCode.LEFT && x > RADIUS)
            {
                ball.setCenterX(x - STEP);
            }

        });
        // Set scene on the stage
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
