import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

/**
 * This program will demonstrate how to create a horizontal List View
 */
public class HorizontalListView extends Application {
    public static void main(String[] args){
        //Launch application
        launch(args);

    }
    @Override
    public void start(Stage primaryStage){
        // Create a horizontal ListVeiw
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Monday", "Tuesday","Wednesday","Thursday", "Friday");

        listView.setOrientation(Orientation.HORIZONTAL);
        listView.setPrefSize(200, 50);

        //Add controls to HBox
        HBox hbox = new HBox(listView);
        hbox.setPadding(new Insets(10));
        hbox.setAlignment(Pos.CENTER);

        // Create and Display Scene
        Scene scene = new Scene(hbox);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
