/**
 * 
 */

package ca.bcit.comp1510.lab04;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Face - makes a face.
 * @author Chaturvedi,Parth
 * @version 09-02-2021
 */
public class Face extends Application {

    /**
     * presents javafx.
     * @param primaryStage
     * 
     */
    
    public void start(Stage primaryStage) throws Exception {
        
        Rectangle hair = new Rectangle(150, 0, 200, 150);
        hair.setFill(Color.BLACK);
        
        //Circle base = new Circle()
        
        Ellipse base = new Ellipse(250.0f, 150.0f, 100.0f, 120.f);
        base.setFill(Color.rgb(197, 140, 133));
        
        Circle leye = new Circle(200, 125, 25);
        leye.setFill(Color.WHITE);
        
        Circle reye = new Circle(300, 125, 25);
        reye.setFill(Color.WHITE);
        
        Circle leyeball = new Circle(200, 125, 10);
        leyeball.setFill(Color.BLACK);
        
        Circle reyeball = new Circle(300, 125, 10);
        reyeball.setFill(Color.BLACK);
        
        Ellipse nose =  new Ellipse(250.0f, 175.0f, 10.0f, 12.f);
        nose.setFill(Color.rgb(156, 115, 109));
        
        Line mouth = new Line(200,225,300,225);
        
        Group face = new Group(hair, base, leye, reye, leyeball, reyeball,
            nose, mouth);
        
        Scene scene = new Scene(face, 500, 500, Color.BLUE);
        
        primaryStage.setTitle("Face");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
    * Drives the program.
    * @param args unused
    */
    
    public static void main(String[] args) {
        launch(args);
    }
   

    
    
        
    
}
