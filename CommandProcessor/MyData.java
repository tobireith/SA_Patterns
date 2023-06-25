package Klausurvorbereitung.CommandProcessor;


/**
 * @author capis
 * @version 1.0
 * @created 25-Jun-2023 13:25:21
 */
public class MyData {

	private int a;
	private int b;
	private int c;

	public MyData(){

	}

	public MyData(int a, int b, int c){
		setA(a);
		setB(b);
		setC(c);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
}//end MyData