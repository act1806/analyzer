package analyzer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;

	@Override
	public void start(Stage primaryStage) throws Exception {
		 try {
		 		this.primaryStage = primaryStage;
	            // 这里的root从FXML文件中加载进行初始化，这里FXMLLoader类用于加载FXML文件
			 AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("/resources/view/Shooting.fxml"));
	            Scene scene = new Scene(root, 600, 400);
	            primaryStage.setScene(scene);
	            // primaryStage.setTitle("Hello World");
	            primaryStage.show();
	        } catch(Exception e) {
	            e.printStackTrace();
	        }

    }

	/**
	 * Returns the main stage.
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

    public static void main(String[] args) {
        // JavaFX中main函数必须需要调用launch函数
        launch(args);
    }


}
