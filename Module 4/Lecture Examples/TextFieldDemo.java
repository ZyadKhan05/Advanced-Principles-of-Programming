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

public class TextFieldDemo extends Application {
    public void start(Stage PrimaryStage) {
        PrimaryStage.setTitle("TextField Example");
        TextField T = new TextField("");
        T.setAlignment(Pos.CENTER);

        TilePane pane = new TilePane();

        Label label = new Label("Enter Your Name!");

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                String str = "Hello " + T.getText() + " nice to meet you!";
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
        launch(args);
    }
}