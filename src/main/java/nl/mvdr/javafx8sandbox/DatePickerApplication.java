package nl.mvdr.javafx8sandbox;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Application showing off how to create a JavaFX component using a builder. Note that the builder API is deprecated.
 * 
 * @author Martijn van de Rijdt
 */
public class DatePickerApplication extends Application {
    /** {@inheritDoc} */
    @Override
    public void start(Stage primaryStage) {
        LocalDate java8Release = LocalDate.of(2014, 3, 18);
        DatePicker datePicker = new DatePicker(java8Release);
        datePicker.setOnAction(event -> System.out.println(datePicker.getValue()));
        
        primaryStage.setTitle("Date Picker");
        Scene scene = new Scene(new Group(datePicker));
        scene.setFill(Color.GRAY);
        primaryStage.setScene(scene);
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);
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
