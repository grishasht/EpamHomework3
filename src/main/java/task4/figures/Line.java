package task4.figures;

public class Line extends FigureData implements Figure {
    public Line(Integer rectNum, String color) {
        super(rectNum, color);
    }

    @Override
    public String putFigure() {
        return "Line putted. Its size: " + rectNum + "\tIts color: " + color;
    }
}