import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

/**
 * This program was made by Justin Frock on April 10th 2023 For CIS-232
 * This program will show how to use CSS Files to change button colors
 */
public class CSSDemo9 extends Application {
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
