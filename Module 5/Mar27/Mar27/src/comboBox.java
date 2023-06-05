import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.event.ActionListener;

public class comboBox extends Application{
    public static void main(String args[]) {
        // launch
        launch(args);
    }
    @Override
    public void start (Stage primaryStage){
        // Create combo box
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("England", "Scotland", "Ireland", "Wales");

        Label label = new Label("Select a Country ");
        Button button = new Button("Get Selection");

        button.setOnAction(event -> {
            label.setText(comboBox.getValue());
        });

        // Add vbox controls
        VBox vbox = new VBox(10,comboBox, label, button);
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
