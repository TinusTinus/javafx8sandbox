package nl.mvdr.javafx8sandbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Application showing off how to create a JavaFX component using its constructor.
 * 
 * @author Martijn van de Rijdt
 */
public class ConstructorApplication extends Application {
    /** {@inheritDoc} */
    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Click me!");
        button.setDefaultButton(true);
        button.setOnAction(event -> System.out.println("clicked"));
        
        primaryStage.setTitle("Button");
        primaryStage.setScene(new Scene(button));
        primaryStage.show();
    }
    
    /**
     * Main method.
     * 
     * @param args
     *            commandline parameters; these are passed on to JavaFX
     */
    public static void main(String[] args) {
        launch(args);
    }
}
