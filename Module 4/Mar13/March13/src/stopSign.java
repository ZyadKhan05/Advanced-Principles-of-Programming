import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.*;
import java.io.*;
import java.util.Scanner;

import javafx.scene.input.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

import static javafx.application.Application.launch;

public class stopSign extends Application {
    public static void main(String[] args) {
        // Launch the application
        launch(args);
    }

    public void start(Stage primaryStage){
        final double SCENE_WIDTH = 160.0;
        final double SCENE_HEIGHT = 160.0;
        final double ANGLE = 45.0;

        // Constants for the vertices
        final double x1 = 60.0, y1 = 20.0;
        final double x2 = 100.0, y2 = 20.0;
        final double x3 = 140.0, y3 = 60.0;
        final double x4 = 140.0, y4 = 100.0;
        final double x5 = 100.0, y5 = 140.0;
        final double x6 = 60.0, y6 = 140.0;
        final double x7 = 20.0, y7 = 100.0;
        final double x8 = 20.0, y8 = 60.0;

        // Constants for the text
        final double TEXT_X = 35.0;
        final double TEXT_Y = 95.0;
        final double FONT_SIZE = 38.0;

        // Create an octagon
        Polygon octagon = new Polygon(x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6, x7, y7, x8, y8);
        // Set the octagon's fill color to red
        octagon.setFill(Color.RED);

        // Create stopText
        Text stopText = new Text(TEXT_X, TEXT_Y, "STOP");

        stopText.setStroke(Color.WHITE);
        stopText.setFill(Color.WHITE);
        stopText.setFont(new Font("SanSerif", FONT_SIZE));

        // Add octagon to Pane
        Pane pane = new Pane(octagon, stopText);
        pane.setRotate(ANGLE);

        // Create scene and show
        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
