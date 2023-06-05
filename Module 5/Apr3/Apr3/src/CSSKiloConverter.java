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
import javafx.scene.control.*;


// This program was created by Zyad Khan on April 3rd, 2023 for CIS-231-01
// This program will demonstrate a CSS Kilo Converter

public class CSSKiloConverter extends Application {
    private TextField kiloTextField;
    private Label resultLabel;

    public static void main(String args[]) {
        // launch
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a Label to display a prompt
        Label promptLabel = new Label("Enter in a Distance in kilometers: ");

        // Create the text field input
        kiloTextField = new TextField();

        // Create button
        Button calcButton = new Button("Convert");

        calcButton.setOnAction(event -> {
            Double kilometers = Double.parseDouble(kiloTextField.getText());

            // Convert to miles
            Double miles = kilometers  * 0.6214;

            // Display the results
            resultLabel.setText(String.format("%.1f", miles));
        });
        resultLabel = new Label();
        resultLabel.setStyle("-fx-font-size: 14pt; -fx-font-weight: bold");

        // put prompt label and kilo text field in hbox
        HBox hbox = new HBox(10, promptLabel, kiloTextField);

        // put hbox, button, and result into Vbox
        VBox vbox = new VBox(10, hbox, calcButton, resultLabel);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(10));

        //Create and display scene
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}