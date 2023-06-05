import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

// This program was written by Zyad Khan for CIS-232-01 Assignment #4 on 3/8/23
// The purpose of this program is to use JavaFX to create an application that will allow the user to
// enter the food charge for a meal at a restaurant. When the button is clicked by the user, the
// application will calculate and display the amount of an 18 percent tip on the total food charge,
// 6 percent sakes tax, and the total of the three amounts.

public class Problem2 extends Application {
    public void start(Stage primaryStage) {
        // Set title for the application
        primaryStage.setTitle("Restaurant Amount");
        // Create textField
        TextField T = new TextField("");
        T.setAlignment(Pos.CENTER);

        TilePane pane = new TilePane();

        // Create the labels
        Label amountLabel = new Label("What was your amount?");
        Label tipLabel = new Label("");
        Label taxLabel = new Label("");
        Label totalLabel = new Label("");

        // Create the image and use it in the button that is used by the user
        Image image = new Image("https://static.onecms.io/wp-content/uploads/sites/19/2017/08/11/GettyImages-88841527-2000.jpg");
        ImageView iw = new ImageView(image);
        iw.setFitWidth(100);
        iw.setFitHeight(100);
        Button tipButton = new Button("Add a 18% Tip and Calculate Total", iw);

        // Create the vbox
        VBox vbox = new VBox(10, tipButton);

        // Set the scene alignment
        vbox.setAlignment(Pos.CENTER);

        // Create Action Event for the button
        EventHandler<ActionEvent> tipEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(T.getText());
                    amountLabel.setText("Amount:  $" + amount);

                    double tip = amount * 0.18;
                    tipLabel.setText("Tip: $" + tip);

                    double tax = amount * 0.06;
                    taxLabel.setText("Tax: $" + tax);

                    double total = amount + tip + tax;
                    totalLabel.setText("Total: $" + total);
                } catch (Exception a){
                    amountLabel.setText("Input Error: " + a.getMessage() + ". Try Again!");
                    }
            }
        };
        // Run the action event when the textfield is entered or the button is selected
        T.setOnAction(tipEvent);
        tipButton.setOnAction(tipEvent);

        // Add text field and labels to the vbox
        vbox.getChildren().add(T);
        vbox.getChildren().add(amountLabel);
        vbox.getChildren().add(tipLabel);
        vbox.getChildren().add(taxLabel);
        vbox.getChildren().add(totalLabel);

        // Create the scene and display it
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        // Display the purpose of this program to the user
        System.out.println("The purpose of this program is to use JavaFX to create an application that will allow the user " +
                "to enter the food charge for a meal at a restaurant.");
        System.out.println("When the button is clicked by the user, the application will calculate and display the amount of an 18 percent tip " +
                "on the total food charge, 6 percent sakes tax, and the total of the three amounts. ");
        launch(args);
    }
}
