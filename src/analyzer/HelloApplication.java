package analyzer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		 try {
	            // 这里的root从FXML文件中加载进行初始化，这里FXMLLoader类用于加载FXML文件
	            BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("MainPane.fxml"));
	            Scene scene = new Scene(root, 426, 323);
	            primaryStage.setScene(scene);
	            primaryStage.setTitle("Hello World");
	            primaryStage.show();
	        } catch(Exception e) {
	            e.printStackTrace();
	        }

    }

    public static void main(String[] args) {
        // JavaFX中main函数必须需要调用launch函数
        launch(args);
    }


}
