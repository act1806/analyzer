package analyzer.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;

import analyzer.service.ShootBufferedStill;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;

/**
 * Created by Administrator on 2018/6/24.
 */
public class ShootingController {
    @FXML
    private Button btnPrint;

    @FXML
    private Button btnCancel;

    @FXML
    private ImageView imgFmCamara;

    @FXML
    protected void handleBtnPrint(ActionEvent event) throws Exception {
        BufferedImage image = null;
        try {
//           image = ImageIO.read(new File("D:/sample.jpg"));
        	image = ShootBufferedStill.shootBufferedStill("/home/pi/Desktop");
    		// Attempt to create an instance of RPiCamera, will fail if raspistill is not properly installed
    		
            //ImageIO.write(image, "png", new File("D:/test.png"));
            System.out.println("image写入完毕");
        } catch (IOException e) {
            System.out.println("Image failed to load.");
            e.printStackTrace();
        }

        WritableImage wImage = new WritableImage(image.getWidth(),image.getHeight());
        System.out.println("image.getWidth()"+image.getWidth()+"  image.getHeight()"+image.getHeight());
        System.out.println("wImage.getWidth()"+wImage.getWidth()+"  wImage.getHeight()"+wImage.getHeight());
        SwingFXUtils.toFXImage(image, wImage);//什么作用

//        imgFmCamara.setFitHeight(600);
//        imgFmCamara.setFitWidth(900);
        imgFmCamara.setImage(wImage);

    }
}
