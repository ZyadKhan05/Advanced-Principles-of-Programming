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

public class listviewDemo extends Application {
    public static void main(String args[]) {
        // launch
        launch(args);
    }
    @Override
    public void start (Stage primaryStage){
        // Create Listview of Strings
        ListView<String> listView = new ListView<>();
        listView.setPrefSize(120,100);
        listView.getItems().addAll("Steve", "Bethany", "Will", "Kathy");

        // Create a label to display selections
        Label label = new Label("Select a Name");

        // Create button to get the selection
        Button button = new Button("Select a Name");

        button.setOnAction(e -> {
            String selected = listView.getSelectionModel().getSelectedItem();
            label.setText(selected);
        });

        // Add vbox controls
        VBox vbox = new VBox(10,listView, label, button);
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);

        // Create and display scene
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}