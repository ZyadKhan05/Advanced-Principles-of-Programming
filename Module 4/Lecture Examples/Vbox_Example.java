import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;

/**
 * Justin Frock CIS-132 March 8th
 * This Program will demonstrate JavaFx Hbox contrtols
 */

public class Vbox_Example extends Application {
    //Launch Method
    public void start(Stage stage){
        //Set title
        stage.setTitle("VBox Demo Example");

        // Create Vbox object and set its Spacing
        VBox vbox = new VBox(15);

        //Set Alignment
        vbox.setAlignment(Pos.TOP_CENTER);

        //Create Label
        Label label = new Label("This is a VBox with Buttons Demo");

        //Add Label
        vbox.getChildren().add(label);

        //Add buttons using for loop
        for (int i = 0; i<5; i++){
            vbox.getChildren().add(new Button("Button "+(int)(i+1)));
        }
        //Set Scene Width and Height
        Scene scene = new Scene(vbox, 800, 500);

        //Set Stage and Show Window
        stage.setScene(scene);
        stage.show();
    }
    //Main Driver Program
    public static void main(String[] args){
        launch();
    }
}
