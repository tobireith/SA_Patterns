package Klausurvorbereitung.CommandProcessor;

public class Aufrufer {
    private CommandProcessor m_CommandProcessor;

    public static void main(String[] args) {
        Aufrufer a = new Aufrufer();

        a.executeProgramm();
    }

    public Aufrufer() {
        m_CommandProcessor = new CommandProcessor();

        m_CommandProcessor.setM_MyData(new MyData(4, 6, 10));

    }

    public void executeProgramm() {
        m_CommandProcessor.executeCommand(new MyPrint());
        m_CommandProcessor.executeCommand(new Square());
        m_CommandProcessor.executeCommand(new MyPrint());
        m_CommandProcessor.executeCommand(new NiceCalculation());
        m_CommandProcessor.executeCommand(new MyPrint());
        m_CommandProcessor.executeCommand(new Shuffle());
        m_CommandProcessor.undoLastCommands(1);
        m_CommandProcessor.executeCommand(new MyPrint());
        m_CommandProcessor.executeCommand(new Shuffle());
        m_CommandProcessor.executeCommand(new MyPrint());
    }
}
