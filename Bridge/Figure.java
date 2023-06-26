package Klausurvorbereitung.Bridge;


/**
 * @author capis
 * @version 1.0
 * @created 26-Jun-2023 11:31:15
 */
public abstract class Figure {

	private Drawing m_Drawing;

	public Figure(Drawing drawing){
		m_Drawing = drawing;
	}

	public abstract void draw();

	protected void drawCircle(double x, double y, double r){
		m_Drawing.drawCircle(x, y, r);
	}

	protected void drawEllipse(double x1, double x2, double y1, double y2, double r){
		m_Drawing.drawEllipse(x1, x2, y1, y2, r);
	}

	protected void drawLine(double x1, double x2, double y1, double y2){
		m_Drawing.drawLine(x1, x2, y1, y2);
	}
}//end Figure