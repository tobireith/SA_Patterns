package Klausurvorbereitung.Bridge;


/**
 * @author capis
 * @version 1.0
 * @created 26-Jun-2023 11:31:11
 */
public class D2DrawingProgram {

	public D2DrawingProgram(){

	}

	public void drawRainbowCircle(double x, double y, double r){
		System.out.println(String.format("Rainbow Circle x:%s y:%s r:%s", x, y, r));
	}

	public void drawRainbowEllipse(double x1, double x2, double y1, double y2, double r){
		System.out.println(String.format("Rainbow Ellipse x1:%s x2:%s y1:%s y2:%s r:%s", x1, x2, y1, y2, r));
	}

	public void drawRainbowLine(double x1, double x2, double y1, double y2){
		System.out.println(String.format("Rainbow Line x1:%s x2:%s y1:%s y2:%s", x1, x2, y1, y2));
	}
}//end D2DrawingProgram