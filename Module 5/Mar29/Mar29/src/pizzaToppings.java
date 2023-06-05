import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.*;

// This program will demonstrate how to use checkboxes in a practical application
// created by Zyad Khan CIS-232

public class pizzaToppings extends  Application{
    // fields
    CheckBox pepperoniCheckbox;
    CheckBox cheeseCheckbox;
    CheckBox anchoviesCheckbox;
    Label totalLabel;

    public static void main(String args[]){
        // launch the application
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        pepperoniCheckbox = new CheckBox("Pepperoni $3.00");
        cheeseCheckbox = new CheckBox("Cheese $2.00");
        anchoviesCheckbox = new CheckBox("Anchovies $1.00");

        // Create total button
        Button totalButton = new Button("Get Total");
         // Register the event handler
        totalButton.setOnAction(event -> {
            double result = 0;

            // add up toppings
            if (pepperoniCheckbox.isSelected()){
                result += 3.0;
            }
            if (cheeseCheckbox.isSelected()){
                result += 2.0;
            }
            if (anchoviesCheckbox.isSelected()){
                result += 1.0;
            }
            // Display the results
            totalLabel.setText("Total: " + String.format("$%,.2f", result));
        });


        // Create total label
        totalLabel = new Label();

        // put checkboxes in VBox
        VBox checkBoxVBox = new VBox(10, pepperoniCheckbox, cheeseCheckbox, anchoviesCheckbox);

        // Create vbox
        VBox mainVBox = new VBox(10, checkBoxVBox, totalButton, totalLabel);
        // Set the mainvbox alignment to center
        mainVBox.setAlignment(Pos.CENTER);
        // Set vbox padding to 10
        mainVBox.setPadding(new Insets(10));

        Scene scene = new Scene(mainVBox);


        primaryStage.setTitle("Pizza Toppings Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
