package nl.mvdr.javafx8sandbox;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Application showing off how to create a JavaFX component using FXML.
 * 
 * @author Martijn van de Rijdt
 */
public class FXMLApplication extends Application {
    /** {@inheritDoc} */
    @Override
    public void start(Stage primaryStage) throws IOException {
        Button button = (Button)FXMLLoader.load(getClass().getResource("/fxmlapplication.fxml"));

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
