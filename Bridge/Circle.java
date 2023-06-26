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

	public Circle(Drawing drawing, double x, double y, double r){
		super(drawing);
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public void draw(){
		super.getDrawing().drawCircle(x, y, r);
	}
}//end Circle