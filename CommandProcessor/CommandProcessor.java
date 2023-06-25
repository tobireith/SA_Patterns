package Klausurvorbereitung.CommandProcessor;


import java.util.Stack;

/**
 * @author capis
 * @version 1.0
 * @created 25-Jun-2023 13:25:14
 */
public class CommandProcessor {

	private Stack<ICommand> history;
	public MyData m_MyData;

	public CommandProcessor(){
		history = new Stack<>();
	}

	/**
	 * 
	 * @param c
	 */
	public void executeCommand(ICommand c){
		c.execute(m_MyData);
		history.push(c);
	}

	/**
	 * 
	 * @param n
	 */
	public void undoLastCommands(int n){

		for (int i = 0; i < n; i++) {
			if (!history.isEmpty()) {
				ICommand cmd = history.pop();
				if (cmd instanceof ICommandWithUndo) {
					((ICommandWithUndo) cmd).undo(m_MyData);
				}
			} else {
				break;
			}
		}
	}

	public MyData getM_MyData() {
		return m_MyData;
	}

	public void setM_MyData(MyData m_MyData) {
		this.m_MyData = m_MyData;
	}


}//end CommandProcessor