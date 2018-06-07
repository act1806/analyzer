package analyzer.controller;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainPaneController {
	    @FXML
	    private Button btnStart;
	    
	    @FXML
	    private Button btnAddItem;

	    @FXML
	    protected void handleButtonStart(ActionEvent event) throws IOException {
	    	BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("SelectItem.fxml"));
            Scene scene = new Scene(root, 426, 323);
            Stage stage2 = new Stage();
            stage2.setScene(scene);
	    }
	    
	    @FXML
	    protected void handleButtonAddItem(ActionEvent event) {
	    	btnAddItem.setText("添加项目事件");
	    }

}
