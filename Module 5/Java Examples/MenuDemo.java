import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class MenuDemo extends Application{
    public static void main(String[] args){
        //Launch Program
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        final double WIDTH= 300.0, HEIGHT = 200.0;

        //Create the menu bar
        MenuBar menubar = new MenuBar();
        //create file menu
        Menu fileMenu = new Menu("File");
        MenuItem exitItem = new MenuItem("Exit");
        fileMenu.getItems().add(exitItem);
        //Register an event handler for exit item
        exitItem.setOnAction(event -> {
            primaryStage.close();
        });

        //Add the file menu to menu bar
        menubar.getMenus().addAll(fileMenu);
        //Add Borderpane
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menubar);
        //Create Scene and display scene
        Scene scene = new Scene (borderPane, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}