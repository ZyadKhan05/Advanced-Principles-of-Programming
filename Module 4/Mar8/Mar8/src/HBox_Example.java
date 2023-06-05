import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.*;
import javafx.scene.web.*;
import javafx.scene.Group;
import javafx.geometry.*;

// This program will demonstrate JavaFX HBox controls
public class HBox_Example extends Application {
    // Launch method
    public void start(Stage stage){
        stage.setTitle("HBox Example");

        HBox hbox = new HBox(10);

        hbox.setAlignment(Pos.TOP_CENTER);

        Label label = new Label("This is a HBox with Buttons demo");

        hbox.getChildren().add(label);

        for(int i = 0; i < 5; i++){
            hbox.getChildren().add(new Button("Button "+(int)+( i + 1)));
        }
        Scene scene = new Scene(hbox, 800, 300);

        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
