package Controller;

import FXApp.MainFXApp;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

/**
 * Initial layout on top of which the panes change
 * @author Dong Son Trinh
 *
 */
public class InitialStageController {

	/**
	 * reference to mainApp
	 */
	@SuppressWarnings("unused")
	private MainFXApp mainApp;
	

	/**
	 * Setup the main application link so we can call methods there
	 * @param main	reference to the FXApp instance
	 */
	public void setMainApp(MainFXApp mainApp) {
		this.mainApp = mainApp;
	}
	
	/**
	 * Close menu item event handler
	 */
	@FXML
    private void handleCloseMenu() {
        System.exit(0);
    }
	
	/**
	 * About menu item event handler
	 */
	@FXML
	private void handleAboutMenu() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("M4 Project");
        alert.setHeaderText("About");
        alert.setContentText("Simple Implementation of User login and register");

        alert.showAndWait();
    }
}