import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class exampleMenuDemo extends Application{
    public static void main(String args[]){
        // launch
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        final double WIDTH = 300.0, HEIGHT = 200.0;

        // create menu bar
        MenuBar menuBar = new MenuBar();

        // Create file menu
        Menu fileMenu = new Menu("File");
        MenuItem exitItem = new MenuItem("Exit");
        fileMenu.getItems().add(exitItem);

        // Register an event handler for exit item
        exitItem.setOnAction(event -> {
            primaryStage.close();
        });
        // Add file menu to menu bar
        menuBar.getMenus().addAll(fileMenu);

        // Add Borderpane
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);

        // Create scene and display
        Scene scene = new Scene(borderPane, WIDTH, HEIGHT);
        primaryStage.setTitle("Menu Demo");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
