package Klausurvorbereitung.CommandProcessor;


/**
 * @author capis
 * @version 1.0
 * @created 25-Jun-2023 13:25:28
 */
public class Square implements ICommandWithUndo {

	public Square(){

	}

	@Override
	public void undo(MyData data){
		data.setA((int) Math.sqrt(data.getA()));
	}

	@Override
	public void execute(MyData data) {
		data.setA((int) Math.pow(data.getA(), 2));
	}
}//end Square