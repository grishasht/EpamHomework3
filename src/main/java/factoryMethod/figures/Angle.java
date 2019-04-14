package factoryMethod.figures;

public class Angle extends FigureData implements Figure {
    public Angle(Integer rectNum, String color) {
        super(rectNum, color);
    }

    @Override
    public String putFigure() {
        return "Angle putted. Its size: " + rectNum + "\tIts color: " + color;
    }
}
