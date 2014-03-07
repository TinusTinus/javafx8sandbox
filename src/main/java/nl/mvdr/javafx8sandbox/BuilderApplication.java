package nl.mvdr.javafx8sandbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBuilder;
import javafx.stage.Stage;

/**
 * Application showing off how to create a JavaFX component using a builder. Note that the builder API is deprecated.
 * 
 * @author Martijn van de Rijdt
 */
@SuppressWarnings("deprecation") // this code sample is supposed to illustrate the deprecation of the builder api
public class BuilderApplication extends Application {
    /** {@inheritDoc} */
    @Override
    public void start(Stage primaryStage) {
        Button button = ButtonBuilder.create()
                .text("Click me!")
                .defaultButton(true)
                .onAction(event -> System.out.println("clicked"))
                .build();
                
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
