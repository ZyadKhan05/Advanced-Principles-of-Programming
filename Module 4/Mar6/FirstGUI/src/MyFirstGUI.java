import javafx.application.Application;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class MyFirstGUI extends Application{
    public static void main(String[] args){
        launch(args);
    }

    // Launch/Start the Method
    @Override
    public void start(Stage primaryStage){
        // Set Title of the GUI
        primaryStage.setTitle("My First GUI Application");

        // Show window
        primaryStage.show();
    }
}
