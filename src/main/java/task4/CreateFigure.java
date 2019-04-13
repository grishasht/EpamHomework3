package task4;

import task4.figures.*;

import java.util.NoSuchElementException;
import java.util.Random;

public class CreateFigure {
    public static Figure createFigure(Integer chooseFigure){
        Random random = new Random();
        switch (chooseFigure){
            case 0: return new Angle(4, "green");
            case 1: return new Rectangle(4, "yellow");
            case 2: return new Line(4, "red");
            case 3: return new Cross(4, "blue");
            case 4: return new RandomFigure(random.nextInt(6), "grey");
            default: throw new NoSuchElementException("No such figure");
        }
    }
}
