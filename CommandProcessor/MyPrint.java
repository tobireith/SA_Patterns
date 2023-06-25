package Klausurvorbereitung.CommandProcessor;


/**
 * @author capis
 * @version 1.0
 * @created 25-Jun-2023 13:25:22
 */
public class MyPrint implements ICommand {

	public MyPrint(){

	}

	@Override
	public void execute(MyData data) {
		System.out.println(String.format("Data: a=%s, b=%s, c=%s", data.getA(), data.getB(), data.getC()));
	}
}//end MyPrint