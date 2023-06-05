import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 * Creating a Java FX Textfield with Numbers CIS 232 Justin Frock
 */
public class TextFeildNumbers extends Application {
    public void start(Stage PrimaryStage) {
        PrimaryStage.setTitle("TextField Example");
        TextField T = new TextField();
        T.setAlignment(Pos.CENTER);

        TilePane pane = new TilePane();

        Label label = new Label("Enter your year of birth to find out your age in 2030");

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                int age_to_int = Integer.parseInt(T.getText());

                int age_2030 = 2030 - age_to_int;

                String str = "You will be " + age_2030 + " in 2030";

                label.setText(str);

            }
        };
        T.setOnAction(event);

        //add textfield
        pane.getChildren().add(T);
        pane.getChildren().add(label);

        Scene sc = new Scene (pane, 200, 200);
        PrimaryStage.setScene(sc);

        PrimaryStage.show();
    }

    public static void main (String[]args){
        //Launch the start Method
        launch(args);
    }
}
