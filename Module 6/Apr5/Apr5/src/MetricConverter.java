import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.*;

// This program is a metric converter created by Zyad Khan for CIS-232 April 5th, 2023

public class MetricConverter extends Application {
    //Fields
    private TextField kiloTextField;
    private Label resultLabel;
    private RadioButton milesButton;
    private RadioButton feetButton;
    private RadioButton inchedButton;
    public static void main (String [] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Create a label to display a prompt to user
        Label promptLabel = new Label("Enter a distance in kilometers");

        //Create a TextField for input
        kiloTextField = new TextField();

        //Create radio button controls
        milesButton = new RadioButton("Convert To Miles");
        feetButton = new RadioButton("Convert To Feet");
        inchedButton = new RadioButton("Convert To Inches");

        //Select the milesButton control
        milesButton.setSelected(true);

        //Add radio buttons to a toggle group
        ToggleGroup radioGroup = new ToggleGroup();
        milesButton.setToggleGroup(radioGroup);
        feetButton.setToggleGroup(radioGroup);
        inchedButton.setToggleGroup(radioGroup);

        //Create button to perform action
        Button calcButton = new Button("Convert");

        //Register event handler
        calcButton.setOnAction(new calcButtonHandler());

        //Create a empty label
        resultLabel = new Label();

        //Put prompt Label and kilo TextField into HBox
        HBox promptHBox = new HBox(10, promptLabel, kiloTextField);
        HBox radioHBox = new HBox(20, milesButton, feetButton, inchedButton);
        VBox mainVBox = new VBox(10, promptHBox, radioHBox, calcButton, resultLabel);

        //Set VBox alignment and padding
        mainVBox.setAlignment(Pos.CENTER);
        mainVBox.setPadding(new Insets(10));

        //Create a scene
        Scene scene = new Scene(mainVBox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Metric Converter");
        primaryStage.show();
    }
    class calcButtonHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            final double MILES_CONVERSION = 0.6214;
            final double FEET_CONVERSION = 3281.0;
            final double INCH_CONVERSION = 39370.0;

            //Variable to hold result
            double result = 0;
            //Get the kilometer
            double kilometers = Double.parseDouble(kiloTextField.getText());

            //Perform the selected conversion
            if(milesButton.isSelected()){
                result = kilometers * MILES_CONVERSION;
            }
            if(feetButton.isSelected()){
                result = kilometers * FEET_CONVERSION;
            }
            if(inchedButton.isSelected()){
                result = kilometers * INCH_CONVERSION;
            }

            //Display the results
            resultLabel.setText(String.format("%,.2f", result));
        }
    }
}