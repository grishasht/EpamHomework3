package task4.figures;

public class Cross extends FigureData implements Figure {
    public Cross(Integer rectNum, String color) {
        super(rectNum, color);
    }

    @Override
    public String putFigure() {
        return "Cross putted. Its size: " + rectNum + "\tIts color: " + color;
    }
}
