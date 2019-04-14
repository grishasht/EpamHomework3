package factoryMethod.figures;

public class RandomFigure extends FigureData implements Figure{
    public RandomFigure(Integer rectNum, String color) {
        super(rectNum, color);
    }

    @Override
    public String putFigure() {
        return "Random figure putted. Its size: " + rectNum + "\tIts color:" + color;
    }
}
