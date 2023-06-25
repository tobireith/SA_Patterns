package Klausurvorbereitung.CommandProcessor;


/**
 * @author capis
 * @version 1.0
 * @created 25-Jun-2023 13:25:19
 */
public interface ICommandWithUndo extends ICommand {

	public void undo(MyData data);

}