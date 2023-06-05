// This program was written by Zyad Khan for CIS-232-01 Assignment #6 on 4/12/2023
// The purpose of this program is to use all of the skills about JavaFX from the class so fare and create a Tic Tac Toe game
// Honor Code:
// I pledge that this work is entirely my own and I have neither given nor received any unauthorized help in its completion. In addition, I will adhere to campus policies and demonstrate behavior that does not disrupt the learning environment.

// Import the required Javafx controls
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.*;


public class ticTacToe extends Application {
    public static void main(String args[]) {
        // Display purpose
        System.out.println("The purpose of this program is to use all of the skills about JavaFX from the class so fare and create a Tic Tac Toe game ");
        // launch the application
        launch(args);
    }

    // Scenes
    Scene menuScene;
    Scene gameScene;

    @Override

    public void start(Stage primaryStage) {
        Player player = new Player();

        //Create TextField for player to enter their name
        TextField player1Input = new TextField();
        TextField player2Input = new TextField();


        //Play Button
        Button playButton = new Button("Play");


        //Create VBox
        VBox vbox1 = new VBox(10, player.player1Label, player1Input);
        VBox vbox2 = new VBox(10, player.player2Label, player2Input);
        HBox hbox = new HBox(10, vbox1, vbox2, playButton);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(10));

        // Create and display the menu scene
        menuScene = new Scene(hbox);
        primaryStage.setScene(menuScene);
        primaryStage.setTitle("Tic-Tac-Toe Menu");
        primaryStage.show();

        // On action of the play button

        playButton.setOnAction((new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                // Set the name variables for each player
                player.p1Name = player1Input.getText();
                player.p2Name = player2Input.getText();

                // Run the following methods to set up the game
                player.setBoard();
                player.isPlayerXO();
                player.isTurn();
                player.setLabel();

                // Create and display the game scene
                gameScene = new Scene(player.gameVbox);
                primaryStage.setScene(gameScene);
                primaryStage.setTitle("Tic-Tac-Toe Game");
                primaryStage.show();
            }
        }));

        //  Quit Button on action event
        player.quitButton.setOnAction(event -> {
            primaryStage.close();
        });

        // Restart Button on action event
        player.restartButton.setOnAction(event -> {
            // Re-enable the board
            player.board.setDisable(false);
            // Run the methods to get game set up
            player.firstTurn();
            player.isTurn();
            player.resetBoard();
            // Hide the restart button and winner label
            player.restartButton.setVisible(false);
            player.winnerLabel.setText("");
            // Set game ending booleans to false
            player.xWins = false;
            player.oWins = false;
        });

        // On Action event for the return to menu button
        player.menuButton.setOnAction(event -> {
            // Pop up alert notifying the players that the game reset
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText("Notice: The Game has reset. Please re-enter the players");
            alert.show();
            // Set the player labels back to the initial state
            player.player1Label.setText("Player 1 Name:");
            player.player2Label.setText("Player 2 Name:");
            // Reset the variables
            player.winnerLabel.setText("");
            player.p1Wins = 0;
            player.p2Wins = 0;
            // Show menu scene
            primaryStage.setScene(menuScene);
        });
    }
}
