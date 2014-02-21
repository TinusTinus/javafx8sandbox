package nl.mvdr.javafx8playground;

import java.util.logging.Logger;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Playing around with uncaught exception handlers in JavaFX 8.
 * 
 * @author Martijn van de Rijdt
 */
public class UncaughtExceptionHandling extends Application {
    /** Log. */
    private static final Logger log = Logger.getAnonymousLogger();

    /** {@inheritDoc} */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Set an uncaught exception handler, which logs the exception message as a warning.
        Thread.currentThread().setUncaughtExceptionHandler(
                (thread, throwable) -> log.warning("An exception occurred! " + throwable.getMessage()));

        // Add a button. Clicking / activating the button generates a runtime exception.
        Button button = new Button("Throw an exception");
        button.setOnAction(event -> {
            throw new RuntimeException("Oh dear.");
        });

        primaryStage.setTitle("Uncaught Exception Handling");
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
