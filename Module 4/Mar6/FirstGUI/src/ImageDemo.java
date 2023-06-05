import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

// Create an Image Demo
public class ImageDemo extends Application{
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        // Create image component
        Image image = new Image("img.png");

        // Create image view
        ImageView imageView = new ImageView(image);

        // Put the ImageView in a Hbox
        HBox hbox = new HBox(imageView);

        // Create the scene with the HBox as the root node
        Scene scene = new Scene(hbox);

        primaryStage.setScene(scene);

        // Set Title
        primaryStage.setTitle("Image of Cat");

        primaryStage.show();

    }
}
