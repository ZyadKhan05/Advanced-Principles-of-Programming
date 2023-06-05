import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import javafx.scene.text.*;
import javafx.scene.Group;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.*;
import java.io.*;

public class test extends Application{
    public static void main(String args[]) {
        // launch
        launch(args);
    }
    @Override
    public void start (Stage primaryStage){

        Image image = new Image ("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg");
        ImageView imageView = new ImageView("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg");
        imageView.setPreserveRatio(true);


        VBox vb = new VBox(10, imageView);

        // Create and display scene
        Scene scene = new Scene(vb);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
