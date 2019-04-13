package task4.figures;

public class Rectangle extends FigureData implements Figure{
    public Rectangle(Integer rectNum, String color) {
        super(rectNum, color);
    }

    @Override
    public String putFigure() {
        return "Rectangle putted. Its size: " + rectNum + "\tIts color: " + color;
    }
}
