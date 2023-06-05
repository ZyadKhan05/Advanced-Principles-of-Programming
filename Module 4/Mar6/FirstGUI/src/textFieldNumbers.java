import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class textFieldNumbers extends Application {
    public void start(Stage primaryStage) {
        primaryStage.setTitle("TextField Example");
        TextField T = new TextField("User Input Here");
        T.setAlignment(Pos.CENTER);

        TilePane pane = new TilePane();

        Label label = new Label("Enter your year of birth to find your age in 2023. ");

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                int age_to_int = Integer.parseInt(T.getText());

                int age_2030 = 2030 - age_to_int;

                String s = String.valueOf(age_2030);

                String str = "You will be " + age_2030 + " in 2030. ";

                label.setText(str);
            }
        };
        T.setOnAction(event);

        // Add text field
        pane.getChildren().add(T);
        pane.getChildren().add(label);

        Scene sc = new Scene (pane, 200, 200);
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
