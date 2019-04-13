package task4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(CreateFigure.createFigure(random.nextInt(5)).putFigure());
        }
    }
}
