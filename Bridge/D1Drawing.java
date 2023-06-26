package Klausurvorbereitung.Bridge;


/**
 * @author capis
 * @version 1.0
 * @created 26-Jun-2023 11:31:07
 */
public class D1Drawing extends Drawing {

	private D1DrawingProgram m_D1DrawingProgram;

	public D1Drawing(){
		m_D1DrawingProgram = new D1DrawingProgram();
	}

	public void drawCircle(double x, double y, double r) {
		m_D1DrawingProgram.draw_a_blue_circle(x,y,r);
	}

	public void drawEllipse(double x1, double x2, double y1, double y2, double r){
		m_D1DrawingProgram.draw_a_blue_ellipse(x1, x2, y1, y2, r);
	}

	public void drawLine(double x1, double x2, double y1, double y2){
		m_D1DrawingProgram.draw_a_blue_line(x1, x2, y1, y2);
	}
}//end D1Drawing