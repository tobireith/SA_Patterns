package Klausurvorbereitung.Bridge;


/**
 * @author capis
 * @version 1.0
 * @created 26-Jun-2023 11:31:18
 */
public class Rectangle extends Figure {

	private double length;
	private double width;
	private double x;
	private double y;
	public Rectangle(Drawing drawing, double length, double width, double x, double y){
		super(drawing);
		this.length = length;
		this.width = width;
		this.x = x;
		this.y = y;
	}

	public void draw(){
		super.getDrawing().drawLine(x, x, y, y+width);
		super.getDrawing().drawLine(x, x+length, y, y);
		super.getDrawing().drawLine(x, x+length, y+width, y+width);
		super.getDrawing().drawLine(x+length, x+length, y, y+width);
	}
}//end Rectangle