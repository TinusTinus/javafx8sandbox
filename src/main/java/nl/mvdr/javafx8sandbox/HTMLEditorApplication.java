package nl.mvdr.javafx8sandbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

/**
 * JavaFX application containing an HTML editor.
 * 
 * @author Martijn van de Rijdt
 */
public class HTMLEditorApplication extends Application {
    /** {@inheritDoc} */
    @Override
    public void start(Stage primaryStage) {
        HTMLEditor editor = new HTMLEditor();
        
        primaryStage.setTitle("HTML Editor In JavaFX");
        primaryStage.setScene(new Scene(editor));
        primaryStage.show();
        
        // print the html text to sysout when exiting the application
        primaryStage.setOnHiding(event -> System.out.println(editor.getHtmlText()));
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
