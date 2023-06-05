import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.*;

// This program will demonstrate how to create a horizontal list view
// created by Zyad Khan CIS-232

public class HorizontalListView extends Application{
    public static void main(String args[]){
        // launch the application
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        // Create a horizontal list iew
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        listView.setOrientation(Orientation.HORIZONTAL);
        listView.setPrefSize(420,50);

        Label dateChosen= new Label();
        Button button = new Button("Select your day");

        button.setOnAction(event -> {
            if(listView.getSelectionModel().getSelectedItem() == "Monday"){
                dateChosen.setText("Monday");
            } else if(listView.getSelectionModel().getSelectedItem() == "Tuesday"){
                dateChosen.setText("Tuesday");
            } else if(listView.getSelectionModel().getSelectedItem() == "Wednesday"){
                dateChosen.setText("Wednesday");
            } else if(listView.getSelectionModel().getSelectedItem() == "Thursday"){
                dateChosen.setText("Thursday");
            } else if(listView.getSelectionModel().getSelectedItem() == "Friday"){
                dateChosen.setText("Friday");
            }else if(listView.getSelectionModel().getSelectedItem() == "Saturday"){
                dateChosen.setText("Saturday");
            }else if(listView.getSelectionModel().getSelectedItem() == "Sunday"){
                dateChosen.setText("Sunday");
            }
        });

        VBox vbox = new VBox(10, listView, button, dateChosen);
        // Add controls to hbox
        HBox hbox = new HBox(10, vbox);
        hbox.setPadding(new Insets(10));
        hbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(hbox);

        primaryStage.setTitle("Horizontal Listview Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
