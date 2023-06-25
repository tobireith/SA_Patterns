package Klausurvorbereitung.CommandProcessor;


/**
 * @author capis
 * @version 1.0
 * @created 25-Jun-2023 13:25:26
 */
public class Shuffle implements ICommandWithUndo {

	public Shuffle(){

	}

	@Override
	public void undo(MyData data){
		int temp = data.getA();
		data.setA(data.getB());
		data.setB(data.getC());
		data.setC(temp);
	}

	@Override
	public void execute(MyData data) {
		int temp = data.getB();
		data.setB(data.getA());
		data.setA(data.getC());
		data.setC(temp);
	}
}//end Shuffle