// This program was written by Zyad Khan for CIS-232-01 Assignment #5 on 3/29/23
// The purpose of this program is to create an application that calculates the booking fees for a hotel.
// The program will provide the two size options for the rooms: King and Queen
// In addition, the program will allow the user to select optional purchases such as the Hotel Dinner or other
// additional purchases and the program will compute the total cost for the configuration made by the user

// Import the required Javafx controls
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.*;
import java.text.DecimalFormat;


public class Problem2 extends Application {
    public static void main(String args[]){
        // Display purpose
        System.out.println("The purpose of this program is to create an application that calculates the booking fees for a hotel. ");
        // launch the application
        launch(args);
    }
    // Initialization of all variables that need to be global
    public static double roomCost;
    public static double dinnerCost;
    public static double giftBagCost;
    public static double sodaCost;
    public static double cityTourCost;
    public static double flowersChocolateCost;
    public static double nights;
    public static double totalCost;

    @Override
    public void start(Stage primaryStage) {
        // Create the list view that will be used for the room type
        ListView<String> roomType = new ListView<>();
        roomType.setPrefSize(50,50);
        roomType.getItems().addAll("King Sized Room $245 per night", "Queen Sized Room $170 per night");

        // Create labels
        Label title = new Label("Book a Room");
        Label roomTypeLabel = new Label("Select your Room Type: ");
        Label costLabel = new Label();
        Label additionalPackagesLabel = new Label("Select any Optional Packages: ");
        Label nightsStayingLabel = new Label("Enter the number of nights you are planning to stay");

        title.setStyle("-fx-text-fill: black; -fx-font-weight: bold; -fx-font-size: 28px;");
        roomTypeLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 16px;");
        additionalPackagesLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 16px;");
        nightsStayingLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 16px;");


        // Create the checkboxes for the additional purchases and dinner option
        CheckBox dinnerCheckbox = new CheckBox("Optional Dinner: Cost $25 per night");
        CheckBox giftBagCheckBox = new CheckBox("Gift Bag Package: $10");
        CheckBox sodaPackageCheckBox = new CheckBox("Soda and Chips Package: $25");
        CheckBox cityTourCheckBox = new CheckBox("City Tour Package: $45");
        CheckBox flowersChocolatesCheckBox = new CheckBox("Romantic Flowers and Chocolates Package: $50");

        // Create textfield to determine how long the user plans to stay
        TextField nightsStaying = new TextField("");

        // Button to get the total cost for the room
        Button button = new Button("Get Total for Room");

        // Decimal format initialization
        DecimalFormat df = new DecimalFormat("#.00");

        Alert a = new Alert(Alert.AlertType.NONE);


        // OnAction for the get total button
        button.setOnAction(e -> {
            // If else statement for the room type
            if(roomType.getSelectionModel().getSelectedItem() == "King Sized Room $245 per night"){
                roomCost = 245;
            } else if(roomType.getSelectionModel().getSelectedItem() == "Queen Sized Room $170 per night"){
                roomCost = 170;
            }

            // If else statement for the dinner checkbox
            if (dinnerCheckbox.isSelected()) {
                dinnerCost = 25;
            } else {
                dinnerCost = 0;
            }

            // If else statements for the additional purchases options
            if (giftBagCheckBox.isSelected()) {
                giftBagCost = 10;
            } else {
                giftBagCost = 0;
            }
            if (sodaPackageCheckBox.isSelected()) {
                sodaCost = 25;
            } else {
                sodaCost = 0;
            }
            if (cityTourCheckBox.isSelected()) {
                cityTourCost = 45;
            } else {
                cityTourCost = 0;
            }
            if (flowersChocolatesCheckBox.isSelected()) {
                flowersChocolateCost = 50;
            } else {
                flowersChocolateCost = 0;
            }

            // Textfield handling
            String strNights = nightsStaying.getText();
            if (nightsStaying.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setHeaderText("Enter in a number for nights staying. Please try again.");
                alert.show();
            } else if (roomType.getSelectionModel().getSelectedItems().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setHeaderText("Make sure to select the Room Type. Please try again.");
                alert.show();
            }
            else{
                try {
                    nights = Double.parseDouble(strNights);
                    totalCost = nights * (roomCost + dinnerCost);
                    totalCost = totalCost + giftBagCost + sodaCost + cityTourCost + flowersChocolateCost;
                    //costLabel.setText("Total cost for the Room: $" + df.format(totalCost) );

                    a.setAlertType(Alert.AlertType.CONFIRMATION);
                    a.setTitle("Room Total");
                    a.setHeaderText("Total cost for your Room: " + String.format("$%,.2f", totalCost));
                    a.show();

                } catch(NumberFormatException exception){
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setHeaderText("Invalid number for nights staying. Please try again.");
                    alert.show();
                }
            }
        });

        VBox titleVbox = new VBox(10, title);
        titleVbox.setAlignment(Pos.TOP_CENTER);

        // Create the vbox elements
        VBox vbox = new VBox(10,roomTypeLabel, roomType);
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);


        VBox vbox2 = new VBox(10,additionalPackagesLabel, giftBagCheckBox, sodaPackageCheckBox, cityTourCheckBox, flowersChocolatesCheckBox);
        vbox2.setPadding(new Insets(20));
        vbox2.setAlignment(Pos.CENTER);

        VBox vbox3 = new VBox(10,nightsStayingLabel, nightsStaying);
        vbox3.setPadding(new Insets(20));
        vbox3.setAlignment(Pos.CENTER);

        VBox vbox4 = new VBox (10, button, costLabel);
        vbox4.setPadding(new Insets(20));
        vbox4.setAlignment(Pos.CENTER);

        // Use the vbox elements for the hbox 
        VBox hbox = new VBox(10,titleVbox, vbox, dinnerCheckbox, vbox2, vbox3, vbox4);
        hbox.setAlignment(Pos.CENTER);
        hbox.setStyle("-fx-background-color: white; "+
                "-fx-background-size: stretch;"  );


        // Create and display scene
        Scene scene = new Scene(hbox);
        primaryStage.setTitle("Hotel Booking System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
