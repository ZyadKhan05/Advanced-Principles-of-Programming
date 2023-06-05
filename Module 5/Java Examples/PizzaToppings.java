import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 * this program will provide pizza toppings via check boxes
 *Justin Frock Cis232 March 29th
 */

public class PizzaToppings extends Application {
    // fields
    CheckBox pepperoniCheckBox;
    CheckBox cheeseCheckBox;
    CheckBox anchoviesCheckBox;
    Label totalLabel;

    public static void main(String[] args){
        //Launch application
        launch(args);

    }
    @Override
    public void start(Stage primaryStage){
        pepperoniCheckBox = new CheckBox("Pepperoni $3.00");
        cheeseCheckBox = new CheckBox("Cheese $2.00");
        anchoviesCheckBox = new CheckBox("Anchovies $1.00");

        // Create total Button
        Button totalButton = new Button("Get Total");
        //Register the event handler
        totalButton.setOnAction(new TotalButtonHandler());

        //Create Label for total
        totalLabel= new Label("0.00");

        //Put checkbox in VBox
        VBox checkBoxVBox = new VBox(10, pepperoniCheckBox,cheeseCheckBox,anchoviesCheckBox);

        VBox mainVBox = new VBox(10, checkBoxVBox, totalButton, totalLabel);

        //Set teh main VBox's alignment to center
        mainVBox.setAlignment(Pos.CENTER);

        //Set VBox padding to 10 pixels
        mainVBox.setPadding(new Insets(10));

        //Create Scene
        Scene scene = new Scene(mainVBox);

        //Add Scene to stage
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    class TotalButtonHandler implements EventHandler<ActionEvent>

    {
        @Override
        public void handle(ActionEvent event)
        {
        //Variable to hold result
        double result = 0;

        //add up toppings.
        if (pepperoniCheckBox.isSelected())
            result += 3.0;
        if (cheeseCheckBox.isSelected())
            result += 2.0;
        if (anchoviesCheckBox.isSelected())
            result += 1.0;

        //Display results
        totalLabel.setText(String.format("$%,.2f", result));
    }
    }


}
