/**
 * 
 */
/**
 * @author Dell
 *
 */
module Comp1510Lab04ChaturvediP {
    requires transitive javafx.graphics;
    requires javafx.fxml;
    requires javafx.media;
    
        
    opens ca.bcit.comp1510.lab04 to javafx.fxml;
    exports ca.bcit.comp1510.lab04;
    
} 