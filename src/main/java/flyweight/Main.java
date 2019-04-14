package flyweight;

import flyweight.becteries.Cell;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreateBactery createBactery = new CreateBactery();
        List<Cell> cells = new LinkedList<>();

        for (int i = 0; i < 50; i++) {
            cells.add(createBactery.createBactery(BacteryType.HEPATIT));
            cells.add(createBactery.createBactery(BacteryType.KOH));
            cells.add(createBactery.createBactery(BacteryType.LACTAT));
        }

        for (int i = 0; i < 50; i++) {
            System.out.printf("Cell : %s\n", cells.get(i).showBactery());
        }
    }
}
