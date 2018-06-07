package test;

import org.junit.Test;

import analyzer.service.OpenCvService;

public class OpenCvServiceTest {

	@Test
	public void test() {
		double c = OpenCvService.getGray(39, 46);
		double t = OpenCvService.getGray(72, 79);
		System.out.println("c: "+c+" t: "+t);
	}
	

}
