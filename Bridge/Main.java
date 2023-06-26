package Klausurvorbereitung.Bridge;

public class Main {
    public static void main(String[] args) {
        D1DrawingProgram program = new D1DrawingProgram();
        Drawing drawing = new D1Drawing(program);
        Figure figure = new Rectangle(drawing, 1, 2, 2, 2);

        figure.draw();

        D2DrawingProgram program2 = new D2DrawingProgram();
        Drawing drawing2 = new D2Drawing(program2);
        Figure figure2 = new Ellipse(drawing2, 1, 2, 2, 3, 1);

        figure2.draw();
    }
}
