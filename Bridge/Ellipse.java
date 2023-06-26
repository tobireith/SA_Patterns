package Klausurvorbereitung.Bridge;


/**
 * @author capis
 * @version 1.0
 * @created 26-Jun-2023 11:31:13
 */
public class Ellipse extends Figure {

	private double x1;
	private double x2;
	private double y1;
	private double y2;
	private double r;
	private Drawing drawing;

	public Ellipse(Drawing drawing, double x1, double x2, double y1, double y2, double r){
		super(drawing);
		this.drawing = drawing;
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.r = r;
	}

	public void draw(){
		drawing.drawEllipse(x1, x2, y1, y2, r);
	}
}//end Ellipse