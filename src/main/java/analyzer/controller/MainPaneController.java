package analyzer.controller;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainPaneController {
	    @FXML
	    private Button btnStart;
	    
	    @FXML
	    private Button btnAddItem;

	    @FXML
	    protected void handleButtonStart(ActionEvent event) throws IOException {
	    	btnAddItem.setText("启动测试事件");
	    }
	    
	    @FXML
	    protected void handleButtonAddItem(ActionEvent event) {
	    	btnAddItem.setText("添加项目事件");
	    }

}
