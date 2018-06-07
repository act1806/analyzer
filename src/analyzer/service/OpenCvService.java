package analyzer.service;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class OpenCvService {
	/**
	 * 输入列的范围，输出区域内平均灰度值
	 * @param cmin 
	 * @param cmax
	 * @return
	 */
	public static double getGray(int cmin, int cmax) {
		 System.loadLibrary(Core.NATIVE_LIBRARY_NAME);  
         Mat src=Imgcodecs.imread("D:\\pic\\pic4.jpg");  
         Mat grayImag = new Mat(); 
         Imgproc.cvtColor(src, grayImag, Imgproc.COLOR_BGR2GRAY,0);
         double gray = 0;
         for(int i=cmin;i<cmax;i++) {
         	for(int j=2;j<grayImag.rows()-2;j++) {
         		gray = gray + grayImag.get(j, i)[0];
         	}
         }
         int total = (cmax-cmin)*(grayImag.rows()-4);
		return gray/total;
	}
	
}
