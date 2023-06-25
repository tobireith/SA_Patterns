package Klausurvorbereitung.CommandProcessor;


/**
 * @author capis
 * @version 1.0
 * @created 25-Jun-2023 13:25:17
 */
public interface ICommand {

	/**
	 * 
	 * @param data
	 */
	public void execute(MyData data);

}