// Import the required Javafx controls
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.*;

// This program will demonstrate how to use CSS files to change button colors
// This program was written by Zyad Khan for CIS-232 on April 10, 2023
public class CSSDemo9 extends Application{
        public static void main(String[] args) {
            //Launch the application
            launch(args);

        }

        @Override
        public void start(Stage primaryStage) {
            //Create Some Buttons
            Button b1 = new Button("O");
            b1.getStyleClass().add("button-black");

            Button b2 = new Button("X");
            b2.getStyleClass().add("button-white");

            Button b3 = new Button("O");
            b3.getStyleClass().add("button-black");

            Button b4 = new Button("O");
            b4.getStyleClass().add("button-black");

            Button b5 = new Button("X");
            b5.getStyleClass().add("button-white");

            Button b6 = new Button("O");
            b6.getStyleClass().add("button-black");

            Button b7 = new Button("O");
            b7.getStyleClass().add("button-black");

            Button b8 = new Button("X");
            b8.getStyleClass().add("button-white");

            Button b9 = new Button("O");
            b9.getStyleClass().add("button-black");

            //Put the Buttons into a HBox
            HBox  hbox = new HBox(10, b1, b2, b3);
            HBox  hbox1 = new HBox(10, b4, b5, b6);
            HBox  hbox2 = new HBox(10, b7, b8, b9);

            VBox vbox = new VBox(10,hbox,hbox1,hbox2);
            vbox.setAlignment(Pos.CENTER);
            vbox.setPadding(new Insets(10));

            //Create Scene and Display it
            Scene scene = new Scene(vbox);
            scene.getStylesheets().add("demo9.css");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }
