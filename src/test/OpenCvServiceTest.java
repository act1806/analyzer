package test;

import org.junit.Test;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import analyzer.service.OpenCvService;

public class OpenCvServiceTest {

	@Test
	public void test() {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);  
        Mat src=Imgcodecs.imread("D:\\pic\\pic4.jpg");  
		double c = OpenCvService.getGray(src, 39, 46);
		double t = OpenCvService.getGray(src, 72, 79);
		System.out.println("c: "+c+" t: "+t);
	}
	

}
