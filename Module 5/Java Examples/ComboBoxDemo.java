import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class ComboBoxDemo extends Application {
    public static void main(String[] args) {
        //Launch Program
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        //Create a combo box
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("England", "Scotland","Ireland","Whales");

        //Create a Label
        Label outputLabel = new Label("Select a Country");
        Button button = new Button("Get Selection");

        button.setOnAction(event -> {
            outputLabel.setText(comboBox.getValue());
        });
        //Add VBox controls
        VBox vbox = new VBox(10, comboBox,outputLabel,button);
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);

        //Create and Display Scene
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
