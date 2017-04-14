
package texteditor;

import javafx.application.Application;
import javafx.stage.Stage;

public class Test extends Application {
    

    public static void main(String[] args) {
             
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
                
            }
        });
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }


    
