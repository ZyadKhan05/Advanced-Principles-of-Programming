import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.PointLight;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Random;


// This program was written by Zyad Khan for CIS-232-01 Assignment #4 on 3/6/23
// The purpose of this program is to use JavaFX application that simulates a coin that is being tossed.
// When the user presses the button, the application generates a random boolean, and if is true
// then the coin lands on "heads" and if it is false then the coin lands on "tails". Using ImageView control
// and the correct side of the coin is displayed.

public class Problem3 extends Application{
    public static void main(String[] args){
        System.out.println("The purpose of this program is to use JavaFX application that simulates a coin that is being tossed.");
        System.out.println("When the user presses the button, the application generates a random boolean, and if it is true then the coin" +
                "lands on heads and if it is false then the coin lands on tails. Using ImageView control and the correct side of the coin is displayed");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        // initialize random and set the side of the coin to a random boolean
        Random random = new Random();
        boolean side = random.nextBoolean();

        // Initialize javafx elements
        Image image = new Image("https://www.usmint.gov/wordpress/wp-content/uploads/2022/10/2023-american-women-quarters-coin-uncirculated-obverse-philadelphia-768x768.jpg");
        Label label = new Label("");

        // If statement to determine if heads or tails. set the image accordingly
        if (side) {
            image = new Image("https://www.usmint.gov/wordpress/wp-content/uploads/2022/10/2023-american-women-quarters-coin-uncirculated-obverse-philadelphia-768x768.jpg");
            System.out.println("You got heads!");
            primaryStage.setTitle("You got Heads!");
            label.setText("You got Heads! Click the button on the bottom to re-flip");

        }
        else {
            image = new Image("https://upload.wikimedia.org/wikipedia/commons/5/5a/98_quarter_reverse.png");
            System.out.println("You got tails!");
            // Set Title
            primaryStage.setTitle("You got Tails!");
            label.setText("You got Tails! Click the button on the bottom to re-flip");

        }

        // Create image view
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(400);
        imageView.setFitWidth(400);


        // Create restartButton and button for image
        Button restartButton = new Button("Want to Flip Again?");
        Button clickImage = new Button("", imageView);

        // Put the ImageView in a Hbox
        VBox vbox = new VBox(10,clickImage,label, restartButton);

        // Action event for restarting the coin flip
        EventHandler<ActionEvent> restartEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                System.out.println("Reflipping...");
                start(primaryStage);
            }
        };
        // If the image or the restart button is clicked, then the coin is flipped again
        clickImage.setOnAction(restartEvent);
        restartButton.setOnAction(restartEvent);

        // Create the scene with the HBox as the root node
        Scene scene = new Scene(vbox);

        // Set and show the application
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
