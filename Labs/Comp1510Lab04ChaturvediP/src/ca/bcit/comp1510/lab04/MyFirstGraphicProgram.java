/**
 * 
 */

package ca.bcit.comp1510.lab04;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * MyFirstGraphicProgram- uses javafx.
 * @author Chaturvedi, Parth
 * @version 09-02-2021
 */
public class MyFirstGraphicProgram extends Application {

    /**
     * for the screen size. 
     */
    
    public static final int SCR = 500;
    
    /**
     * Drives the program.
     * @param args unused
     */
    
    public static void main(String[] args) {
        launch(args);

    }

    /**
     * presents javafx.
     * @param primaryStage
     * 
     */
    public void start(Stage primaryStage) {
       
        final Circle circle = new Circle(250, 250, 100);
        circle.setFill(Color.GREEN);
        
        final Text name = new Text(200, 250, "Parth Chaturvedi");
        name.setFill(Color.WHITE);
        
        Group root = new Group(circle, name);
        
        Scene scene = new Scene(root, SCR, SCR);
        
        primaryStage.setTitle("MyFirstGraphicProgram");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
