import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 * This program will demonstrate a CSS Kilo Converter
 * Justin Frock CIS-232-01 April 3rd 2023
 */

public class CSSKiloConverter extends Application {
    private TextField kiloTextField;
    private Label resultLabel;

    public static void main(String[] args){
        //Launch the application
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        //Create a Label to siplay a prompt
        Label promptLabel = new Label("Enter a Distance in kilometers");

        //Create the text field input
        kiloTextField = new TextField();

        //Create button
        Button calcButton = new Button("Convert");

        //Create Event handler
        calcButton.setOnAction(event ->
        {
            //Get kilometers
            Double kilometers = Double.parseDouble(kiloTextField.getText());

            //Convert to miles
            Double miles = kilometers * 0.6214;

            //Displays results
            resultLabel.setText(String.format("%,.2f miles", miles));

        });

        resultLabel = new Label();
        resultLabel.setStyle("-fx-font-size: 14pt; -fx-font-weight:bold");

        //put the prompot Label and the kilotextfield in an HBox
        HBox hbox = new HBox(10, promptLabel,kiloTextField);

        //Put button, hbox and results into a VBox
        VBox vbox = new VBox(10, hbox, calcButton,resultLabel);

        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(10));

        //Create Scene and Display it
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        //Add Title
        primaryStage.setTitle("Kilometer Converter");

        //Show Window
        primaryStage.show();
    }

    }
