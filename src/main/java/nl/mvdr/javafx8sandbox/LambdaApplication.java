package nl.mvdr.javafx8sandbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Playing around with lambdas in JavaFX 8.
 * 
 * @author Martijn van de Rijdt
 */
public class LambdaApplication extends Application {
    /** {@inheritDoc} */
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Button not pressed.");
        
        Button button = new Button("Press me!");

        // Without lambdas we would have to write something like:
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                label.setText("Button pressed.");
//            }
//        });
        
        // With lambdas we can simply write:
        button.setOnAction(event -> label.setText("Button pressed."));
        
        primaryStage.setTitle("Lambda");
        primaryStage.setScene(new Scene(new VBox(button, label)));
        primaryStage.show();
    }

    /**
     * Main method.
     * 
     * @param args commandline parameters; these are passed on to JavaFX
     */
    public static void main(String[] args) {
        launch(args);
    }
}
