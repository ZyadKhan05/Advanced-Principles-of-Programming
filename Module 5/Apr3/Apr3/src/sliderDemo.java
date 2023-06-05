import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import javafx.scene.text.*;
import javafx.scene.Group;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.*;
import java.io.*;


// This program was created by Zyad Khan on April 3rd, 2023 for CIS-231-01
// This program will demonstrate how to use a slider object in JavaFx

public class sliderDemo extends Application{
    public static void main(String args[]) {
        // launch
        launch(args);
    }
    @Override
    public void start (Stage primaryStage){
        // Slider constants
        final double MIN = 0.0, MAX = 100.0, INITIAL = 0.0;
        final double MAJOR_TICK_UNIT = 20.0;
        final int MINOR_TICK_COUNT = 5;
        final double SLIDER_WIDTH = 30.0;

        // Misc Content
        final double LABEL_WIDTH = 50.0;
        final double SPACING = 10.0;

        // Create Fahrenheit Control
        Label fDescripter = new Label("Fahrenheit: ");
        Label fLabel = new Label("32.0");
        fLabel.setStyle("-fx-border-style: solid; "+"-fx-alignment: center;");
        fLabel.setPrefWidth(LABEL_WIDTH);
        HBox fhbox = new HBox(SPACING, fDescripter, fLabel);
        fhbox.setAlignment(Pos.CENTER);

        // Label Celsius Controls
        Label cDescripter = new Label("Celsius: ");
        Label cLabel = new Label("0.0");
        cLabel.setStyle("-fx-border-style: solid; "+"-fx-alignment: center;");
        cLabel.setPrefWidth(LABEL_WIDTH);
        HBox chbox = new HBox(SPACING, cDescripter, cLabel);
        chbox.setAlignment(Pos.CENTER);

        // Make the slider
        Slider slider = new Slider(MIN, MAX, INITIAL);
        slider.setShowTickLabels(true);
        slider.setMajorTickUnit(MAJOR_TICK_UNIT);
        slider.setMinorTickCount(MINOR_TICK_COUNT);
        slider.setShowTickLabels(true);
        slider.setSnapToTicks(false);
        slider.setPrefWidth(SLIDER_WIDTH);

        // Register the event handler for the slider
        slider.valueProperty().addListener(((observable, oldValue, newValue )->
        {
            // Get the Celsius temp for the slider
            double celsius = slider.getValue();

            // Convert Celsius to Fahrenheit
            double fahrenheit = (9.0/5.0 * celsius + 32);

            // Display the celsius and fahrenheit values
            cLabel.setText(String.format("%.1f", celsius));
            fLabel.setText(String.format("%.1f", fahrenheit));

        }));

        VBox vbox = new VBox(10, fhbox, chbox,slider);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(SPACING));

        //Create and display scene
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
