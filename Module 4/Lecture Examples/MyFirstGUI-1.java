import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Creating a Java FX GUI CIS 232 Justin Frock
 */

public class MyFirstGUI extends Application {
    public static void main(String [] args){
        //Launch the start Method
        launch(args);
    }

    //Launch/Start Method
    @Override
    public void start(Stage primaryStage){
        //Set Title
        primaryStage.setTitle("My First GUI Application");

        //Show Window
        primaryStage.show();
    }
}
