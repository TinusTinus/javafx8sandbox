package nl.mvdr.javafx8sandbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * JavaFX application containing a web view. Displays a website in a JavaFX application.
 * 
 * @author Martijn van de Rijdt
 */
public class WebSocketApplication extends Application {
    /** {@inheritDoc} */
    @Override
    public void start(Stage primaryStage) {
        WebView view = new WebView();
        view.getEngine().load("http://www.websocket.org/echo.html");
        
        primaryStage.titleProperty().bind(view.getEngine().titleProperty());
        primaryStage.setScene(new Scene(view));
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
