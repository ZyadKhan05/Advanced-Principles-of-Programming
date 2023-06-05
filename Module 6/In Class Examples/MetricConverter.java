import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 * This program is a metric coverter
 * Justin Frock CIS-232 April 5th 2023
 */

public class MetricConverter extends Application {
    //fields
    private TextField kiloTextField;
    private Label resultLabel;
    private RadioButton milesButton;
    private RadioButton feetButton;
    private RadioButton inchesButton;

    public static void main(String [] args){
        // Launch the application
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        //Create a label to display a prompt to user
        Label promptLabel = new Label("Enter a Distance in kilometers");

        //create a TextField for input
        kiloTextField = new TextField();

        //Create radio button controls
        milesButton = new RadioButton("Convert to Miles");
        feetButton = new RadioButton("Convert to Feet");
        inchesButton = new RadioButton("Convert to Inches");

        //Select the mileButton control
        milesButton.setSelected(true);

        //Add radio butttons to a toogle group
        ToggleGroup radioGroup = new ToggleGroup();
        milesButton.setToggleGroup(radioGroup);
        feetButton.setToggleGroup(radioGroup);
        inchesButton.setToggleGroup(radioGroup);

        //Create button to perform action
        Button calcButton = new Button("Convert");

        //Register event handler
        calcButton.setOnAction(new CalcButtonHandler());

        //Create a empty label
        resultLabel = new Label();

        //Put prompt Label and kilo TextFeild into a Hbox
        HBox promptHBox = new HBox(10, promptLabel,kiloTextField);
        HBox radioHBox = new HBox(20, milesButton, feetButton, inchesButton);
        VBox mainVBox = new VBox(10, promptHBox, radioHBox,calcButton,resultLabel);

        //Set VBox Alignment and Padding
        mainVBox.setAlignment(Pos.CENTER);
        mainVBox.setPadding(new Insets(10));

        //Create a Scene and display scene
        Scene scene = new Scene(mainVBox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Metric Converter");
        primaryStage.show();
    }
    class CalcButtonHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            final double MILES_CONVERSION = 0.6214;
            final double FEET_CONVERSION = 3281.0;
            final double INCH_CONVERSION = 39370.0;

            //Variable to hold result
            double result = 0;
            //Get the kilometers
            double kilometers = Double.parseDouble(kiloTextField.getText());

            //Perform the selected conversion
            if (milesButton.isSelected()){
                result = kilometers * MILES_CONVERSION;
            }
            if (feetButton.isSelected()){
                result = kilometers * FEET_CONVERSION;
            }
            if (inchesButton.isSelected()){
                result = kilometers * INCH_CONVERSION;
            }
            //Display the results
            resultLabel.setText(String.format("%,.2f",result));
        }
    }
}