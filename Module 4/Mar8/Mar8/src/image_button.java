import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.*;
import javafx.scene.web.*;
import javafx.scene.Group;
import javafx.geometry.*;
import java.io.*;

// Demo to use an image as a button
public class image_button extends Application {
    public void start(Stage s) throws Exception {
        s.setTitle("Creating images with button");

        Image image = new Image("https://i.kym-cdn.com/entries/icons/original/000/043/403/cover3.jpg");
        ImageView iw = new ImageView(image);
        iw.setFitHeight(100);
        iw.setFitWidth(100);

        Button b = new Button("Button", iw);
        // Create Pane
        TilePane r = new TilePane();

        Label l = new Label("Kitty is waiting to be pet");

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e){
                l.setText("Meow");
            }
        };
        b.setOnAction(event);

        r.getChildren().add(b);
        r.getChildren().add(l);

        Scene sc = new Scene(r, 200, 200);

        s.setScene(sc);
        s.show();
    }
    public static void main(String[] args){
        // Start the Application
        launch(args);
    }
}
