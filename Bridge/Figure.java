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

	public void draw(){

	}

	protected void drawCircle(){

	}

	protected void drawEllipse(){

	}

	protected void drawLine(){

	}

	public Drawing getDrawing() {
		return m_Drawing;
	}
}//end Figure