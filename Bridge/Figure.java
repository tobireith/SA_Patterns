package Klausurvorbereitung.Bridge;


/**
 * @author capis
 * @version 1.0
 * @created 26-Jun-2023 11:31:15
 */
public abstract class Figure {

	public Drawing m_Drawing;

	public Figure(){

	}

	public void finalize() throws Throwable {

	}
	public void draw(){

	}

	protected void drawCircle(){

	}

	protected void drawEllipse(){

	}

	protected void drawLine(){

	}
}//end Figure