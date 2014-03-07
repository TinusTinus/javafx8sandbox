package nl.mvdr.javafx8sandbox;

import javafx.fxml.FXML;

/**
 * Controller for the button in the {@link FXMLApplication} application.
 * 
 * @author Martijn van de Rijdt
 */
public class ButtonController {
    /** Handles a button click by writing a message to sysout. */
    @FXML
    protected void handleButtonAction() {
        System.out.println("clicked");
    }
}
