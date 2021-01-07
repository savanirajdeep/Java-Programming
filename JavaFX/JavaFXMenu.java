//package javaappication1;
/**
 *
 * @author Savani Rajdeep R
 */
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

public class JavaFXMenu extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane  root =new BorderPane();
        Scene scene = new Scene(root, 400, 400);
        MenuBar menubar = new MenuBar();
        Menu FileMenu = new Menu("File");
        MenuItem filemenu1=new MenuItem("new");
        filemenu1.setOnAction(new EventHandler<ActionEvent>()
        {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("New is here");
            }
        }
                
        MenuItem filemenu2=new MenuItem("Save");
        filemenu2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Save is here");
            }
        }
        
        MenuItem filemenu3=new MenuItem("Exit");
        filemenu3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Exit is here");
            }
        }
        
        Menu EditMenu = new Menu("Edit");
        MenuItem EditMenu1=new MenuItem("cut");
        EditMenu1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Cut is here");
            }
        }
        
        MenuItem EditMenu2=new MenuItem("copy");
        EditMenu2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Copy is here");
            }
        }
        
        MenuItem EditMenu3=new MenuItem("paste");
        EditMenu3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Paste is here");
            }
        }
        
        EditMenu.getItems().addAll(EditMenu1,EditMenu2,EditMenu3);
        root.setTop(menubar);
        FileMenu.getItems().addAll(filemenu1,filemenu2,filemenu3);
        menubar.getMenus().addAll(FileMenu,EditMenu);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Java FX Menu");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
