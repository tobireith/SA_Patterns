package Klausurvorbereitung.Bridge;


/**
 * @author capis
 * @version 1.0
 * @created 26-Jun-2023 11:31:10
 */
public class D2Drawing extends Drawing {

	public D2DrawingProgram m_D2DrawingProgram;

	public D2Drawing(){
		m_D2DrawingProgram = new D2DrawingProgram();
	}

	public D2Drawing(D2DrawingProgram program){
		m_D2DrawingProgram = program;
	}

	public void drawCircle(double x, double y, double r){
		m_D2DrawingProgram.drawRainbowCircle(x, y, r);
	}

	public void drawEllipse(double x1, double x2, double y1, double y2, double r){
		m_D2DrawingProgram.drawRainbowEllipse(x1, x2, y1, y2, r);
	}

	public void drawLine(double x1, double x2, double y1, double y2){
		m_D2DrawingProgram.drawRainbowLine(x1, x2, y1, y2);
	}
}//end D2Drawing