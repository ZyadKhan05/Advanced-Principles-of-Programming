import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.geometry.Pos;
import javafx.geometry.Insets;


/**
 * This program was made by Justin Frock on April 3rd 2023 For CIS-232-01
 * This program will demonstrate how to use a slider object in JavaFx
 */

public class SliderDemo extends Application {
    public static void main(String[] args){
        //Launch the application
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        //slider constants
        final double MIN = 0.0, MAX = 100.0, INITIAL = 0.0;
        final double MAJOR_TICK_UNIT = 20.0;
        final int MINOR_TICK_COUNT = 5;
        final double SLIDER_WIDTH = 300.0;

        //Miscellanous constants
        final double LABEL_WIDTH = 50.0;
        final double SPACING = 10.0;

        //Create Fahrenheit controls.
        Label fDescripter = new Label("Farhrenheit: ");
        Label fLabel = new Label("32.0");
        fLabel.setStyle("-fx-border-style: solid;"+"fx-alignment: center");
        fLabel.setPrefWidth(LABEL_WIDTH);
        HBox fHBox = new HBox(SPACING,fDescripter,fLabel);
        fHBox.setAlignment(Pos.CENTER);

        //Label Celsius Controls
        Label cDescriptor = new Label("Celsius:");
        Label cLabel = new Label("0.0");
        cLabel.setStyle("-fx-border-style: solid;"+"fx-alignment: center");
        cLabel.setPrefWidth(LABEL_WIDTH);
        HBox cHBox = new HBox(SPACING,cDescriptor,cLabel);
        cHBox.setAlignment(Pos.CENTER);

        //Make the Slider
        Slider slider = new Slider(MIN,MAX,INITIAL);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(MAJOR_TICK_UNIT);
        slider.setMinorTickCount(MINOR_TICK_COUNT);
        slider.setShowTickLabels(true);
        slider.setSnapToTicks(true);
        slider.setPrefWidth(SLIDER_WIDTH);

        //Register the event handler for the slider
        slider.valueProperty().addListener(((observable, oldValue, newValue) ->
        {
            //Get the Celsius temp for the slider
            double celsius = slider.getValue();

            //Contvert Celsius to fahrenheit
            double fahrenheit = (9.0/5.0 * celsius +32);

            //Diplay the celsius and fahrenheit temps
            cLabel.setText(String.format("%.1f",celsius));
            fLabel.setText(String.format("%.1f",fahrenheit));

        }));
        //Add VBox controls
        VBox vbox = new VBox(10, fHBox,cHBox,slider);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(SPACING));


        //Create Scene and Show
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
