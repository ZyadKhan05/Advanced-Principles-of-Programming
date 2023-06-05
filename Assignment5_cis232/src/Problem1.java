// This program was written by Zyad Khan for CIS-232-01 Assignment #5 on 3/27/23
// The purpose of this program is to use two ComboBox controls with two different types of insurance plans:
// Medical and Dental Plans. Each plan has a separate monthly cost for the type of plan. The user can select a
// medical and dental plan to display their monthly cost or a discounted 6 month cost

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

public class Problem1 extends Application{
        public static void main(String args[]){
            // Display purpose
            System.out.println("The purpose of this program is to use two ComboBox controls with two different types of insurance plans: Medical and Dental Plans. Each plan has a separate monthly cost for the type of plan. The user can select a \n" +
                    "medical and dental plan to display their monthly cost or a discounted 6 month cost");
            // launch the application
            launch(args);
        }

        // Constants used for the costs
        public static double medicalPlanCost;
        public static double dentalPlanCost;

        @Override
        public void start(Stage primaryStage) {
        // The two combo boxes
            ComboBox<String> medicalPlans = new ComboBox<>();
            ComboBox<String> dentalPlans = new ComboBox<>();

            // Add items to the combo box
            medicalPlans.getItems().addAll("Gold Medical Plan: $321.98 per month",
                    "Silver Medical Plan: $210.37 per month",
                    "Bronze Medical Plan: $104.10 per month");
            dentalPlans.getItems().addAll("Gold Dental Plan: $17.80 per month",
                    "Silver Dental Plan: $11.45 per month",
                    "Bronze Dental Plan: $6.22 per month");

            // Labels for the plans
            Label medicalLabel = new Label("Select a Medical Plan");
            Label dentalLabel = new Label("Select a Dental Plan");

            medicalLabel.setStyle("-fx-text-fill: blue; -fx-font-weight: bold");
            dentalLabel.setStyle("-fx-text-fill: blue; -fx-font-weight: bold");

            // Decimal format initialization
            DecimalFormat df = new DecimalFormat("#.00");

            // On event for the medicalPlans comboBox
            medicalPlans.setOnAction(event -> {
                medicalLabel.setText(medicalPlans.getValue());
                if (medicalPlans.getValue() == "Gold Medical Plan: $321.98 per month"){
                    medicalPlanCost = (321.98);

                } else if (medicalPlans.getValue() == "Silver Medical Plan: $210.37 per month") {
                    medicalPlanCost = (210.37);
                } else if(medicalPlans.getValue() == "Bronze Medical Plan: $104.10 per month") {
                    medicalPlanCost = (104.10);
                }
                else {
                    medicalPlanCost = 0;
                    }
                medicalLabel.setText("Medical Plan Cost: $" + df.format(medicalPlanCost));
                System.out.println(medicalPlanCost);

                    }
            );

            // OnAction events for the dentalPlans combobox
            dentalPlans.setOnAction(event2 -> {
                dentalLabel.setText(dentalPlans.getValue());
                if(dentalPlans.getValue() == "Gold Dental Plan: $17.80 per month"){
                    dentalPlanCost = 17.80;
                } else if (dentalPlans.getValue() == "Silver Dental Plan: $11.45 per month") {
                    dentalPlanCost = 11.45;
                } else if(dentalPlans.getValue() == "Bronze Dental Plan: $6.22 per month") {
                    dentalPlanCost = 6.22;
            }
                else {
                    dentalPlanCost =  0;
                }
                dentalLabel.setText("Dental Plan Cost: $" + df.format(dentalPlanCost));
            });

            // Buttons and labels for the monthly cost and the 6 month cost
            Button costButton = new Button("Calculate your monthly Cost");
            Button sixMonthsCostButton = new Button("Pay 6 months for a discount!");
            Label costLabel = new Label();
            Label sixMonthsCostLabel = new Label();

            costButton.setStyle("-fx-text-fill: blue; -fx-font-weight: bold");
            sixMonthsCostButton.setStyle("-fx-text-fill: blue; -fx-font-weight: bold");

            // OnAction event for the monthly cost button
            costButton.setOnAction(e -> {
                double cost = dentalPlanCost + medicalPlanCost;
                costLabel.setText("Your Monthly cost is: $" + df.format(cost));
                costLabel.setStyle("-fx-font-weight: bold");
            });

            // OnAction event for the 6 month cost
            sixMonthsCostButton.setOnAction(e -> {
            double cost = 6*(dentalPlanCost + medicalPlanCost);
            double sixMonthCost = 6*(dentalPlanCost + medicalPlanCost) * .90;
            double discount = cost - sixMonthCost;
            sixMonthsCostLabel.setText("Original 6 month Total: $" + df.format(cost)
                    + "\n10% Discount: $" + df.format(discount)
                    + "\nDiscounted 6 Month Total is: $" + df.format(sixMonthCost));
            sixMonthsCostLabel.setStyle("-fx-font-weight: bold");
            });

            // Create the vbox for all of the elements and align them
            VBox vbox1 = new VBox(10, medicalLabel,medicalPlans, dentalLabel, dentalPlans);
            VBox vbox2 = new VBox(10, costButton, costLabel);
            VBox vbox3 = new VBox(10,sixMonthsCostButton, sixMonthsCostLabel);
            vbox1.setAlignment(Pos.CENTER_LEFT);
            vbox2.setAlignment(Pos.CENTER);
            vbox3.setAlignment(Pos.CENTER);

            // Create the hbox with the 4 vbox elements
            HBox hbox= new HBox(10, vbox1, vbox2 ,vbox3);
            hbox.setPadding(new Insets(100));
            hbox.setAlignment(Pos.CENTER);
            hbox.setStyle("-fx-background-image: url('https://i.pinimg.com/736x/1a/ee/5c/1aee5c344846f449350feae457ea350e.jpg');"+
                    "-fx-background-size: stretch;"  );
            hbox.setMinHeight(500);
            hbox.setMinWidth(600);

            // Create and display scene
            Scene scene = new Scene(hbox);
            primaryStage.setTitle("Private Insurance Plan Calculator");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
}