import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Creating a Java FX Image CIS 232 Justin Frock
 */
public class ImageDemo extends Application {
    public static void main(String [] args){
        //Launch the start Method
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        // Create Image Component Object
        Image image = new Image("cats.jpg");

        //Create Image View
        ImageView  imageView = new ImageView(image);

        // Put the ImageVeiw in a HBox
        HBox hbox = new HBox(imageView);

        // Create the scene with the HBox as the root node
        Scene scene = new Scene(hbox);

        primaryStage.setScene(scene);

        //Set Title
        primaryStage.setTitle("Picture of a Cat");

        //Show Window
        primaryStage.show();


    }
}
