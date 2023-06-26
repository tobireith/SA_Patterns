package Klausurvorbereitung.Bridge;


/**
 * @author capis
 * @version 1.0
 * @created 26-Jun-2023 11:31:17
 */
public class Square extends Figure {
	private double length;
	private double x;
	private double y;
	public Square(Drawing drawing, double length, double x, double y){
		super(drawing);
		this.length = length;
		this.x = x;
		this.y = y;
	}

	public void draw(){
		super.getDrawing().drawLine(x, x, y, y+length);
		super.getDrawing().drawLine(x, x+length, y, y);
		super.getDrawing().drawLine(x, x+length, y+length, y+length);
		super.getDrawing().drawLine(x+length, x+length, y, y+length);
	}
}//end Parallelogram