package Klausurvorbereitung.Bridge;


/**
 * @author capis
 * @version 1.0
 * @created 26-Jun-2023 11:31:09
 */
public class D1DrawingProgram {

	public D1DrawingProgram(){

	}

	public void draw_a_blue_circle(double x, double y, double r){
		System.out.printf("Blue Circle x:%s y:%s r:%s%n", x, y, r);
	}

	public void draw_a_blue_ellipse(double x1, double x2, double y1, double y2, double r){
		System.out.printf("Blue Ellipse x1:%s x2:%s y1:%s y2:%s r:%s%n", x1, x2, y1, y2, r);
	}

	public void draw_a_blue_line(double x1, double x2, double y1, double y2){
		System.out.printf("Blue Line x1:%s x2:%s y1:%s y2:%s%n", x1, x2, y1, y2);
	}
}//end D1DrawingProgram