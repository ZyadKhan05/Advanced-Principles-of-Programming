import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MenuDemo extends Application{
    public static void main(String args[]){
        // launch
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Menu demoMenu = new Menu("Menu");

        MenuItem item1 = new MenuItem("Play Now");
        MenuItem item2 = new MenuItem("Inventory");
        MenuItem item3 = new MenuItem("Store");
        MenuItem item4 = new MenuItem("Settings");
        MenuItem exitItem = new MenuItem("Exit");


        //Adding all the menu items to the menu
        demoMenu.getItems().addAll(item1, item2, item3, item4, exitItem);

        // Register an event handler for exit item
        exitItem.setOnAction(event -> {
            primaryStage.close();
        });

        //Creating a menu bar and adding menu to it.
        MenuBar menuBar = new MenuBar(demoMenu);
        menuBar.setTranslateX(10);
        menuBar.setTranslateY(10);

        //Setting the stage
        Group root = new Group(menuBar);
        Scene scene = new Scene(root, 595, 200, Color.BEIGE);
        primaryStage.setTitle("Menu Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
