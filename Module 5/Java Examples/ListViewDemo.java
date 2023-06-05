import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;


public class ListViewDemo extends Application {
    public static void main(String[] args){
        //Launch Program
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        // Create ListView of Strings
        ListView<String> listView = new ListView<>();
        listView.setPrefSize(120,100);
        listView.getItems().addAll("Steve", "Bethany", "Will","Kathy");

        //Create a Label to display the selections
        Label selectedNameLabel = new Label("Select a Name");
        //Create Button to get the selection
        Button getButton = new Button("Get the Selection");

        getButton.setOnAction(event -> {
            //Get Selected Name
            String selected = listView.getSelectionModel().getSelectedItem();
            //Display the selected name as a label
            selectedNameLabel.setText(selected);

        });
        //Add VBox controls
        VBox vbox = new VBox(10, listView, selectedNameLabel, getButton);
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);

        //Create and Display Scene
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
