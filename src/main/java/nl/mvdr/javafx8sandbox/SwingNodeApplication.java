package nl.mvdr.javafx8sandbox;

import javafx.application.Application;
import javafx.embed.swing.SwingNode;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import javax.swing.JButton;

/**
 * JavaFX application containing a simple embedded Swing application.
 * 
 * Note: adding jvm argument "-Djavafx.embed.singleThread=true" enables an experimental feature: merging the JavaFX and
 * Swing event dispatcher threads into a single thread. If this is enabled, there is no more need to use
 * {@link javax.swing.SwingUtilities#invokeLater(Runnable)}; you can simply always use
 * {@link javafx.application.Platform#runLater(Runnable)}.
 * 
 * @author Martijn van de Rijdt
 */
public class SwingNodeApplication extends Application {
    /** {@inheritDoc} */
    @Override
    public void start(Stage primaryStage) throws Exception {
        JButton swingButton = new JButton("Swing Button!");
        swingButton.addActionListener(event -> System.out.println(Thread.currentThread().getName() + " - Swing button clicked."));
        
        SwingNode swingNode = new SwingNode();
        swingNode.setContent(swingButton);

        Button javaFXButton = new Button("JavaFX Button!");
        javaFXButton.setOnAction(event -> System.out.println(Thread.currentThread().getName() + " - JavaFX button clicked."));
        
        FlowPane pane = new FlowPane(swingNode, javaFXButton);
        
        primaryStage.setTitle("Swing Node In JavaFX");
        primaryStage.setScene(new Scene(pane));
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
