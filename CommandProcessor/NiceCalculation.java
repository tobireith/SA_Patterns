package Klausurvorbereitung.CommandProcessor;


/**
 * @author capis
 * @version 1.0
 * @created 25-Jun-2023 13:25:24
 */
public class NiceCalculation implements ICommand {

	public NiceCalculation(){

	}

	@Override
	public void execute(MyData data) {
		data.setA(data.getB() - data.getC());
	}
}//end NiceCalculation