package Klausurvorbereitung.Bridge;


/**
 * @author capis
 * @version 1.0
 * @created 26-Jun-2023 11:31:06
 */
public class Circle extends Figure {
	private double x;
	private double y;
	private double r;
	private Drawing drawing;

	public Circle(Drawing drawing, double x, double y, double r){
		super(drawing);
		this.drawing = drawing;
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public void draw(){
		drawing.drawCircle(x, y, r);
	}
}//end Circle