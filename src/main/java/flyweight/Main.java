package flyweight;

import flyweight.becteries.Cell;
import flyweight.becteries.Hepatit;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreateBactery createBactery = new CreateBactery();
        List<Cell> cells = new LinkedList<>();

        for (int i = 0; i < 50; i++) {
            cells.add(createBactery.createBactery(BacteryType.HEPATIT, new Hepatit("Hepatit", "green")));
            cells.add(createBactery.createBactery(BacteryType.KOH, new Hepatit("Koh", "yellow")));
            cells.add(createBactery.createBactery(BacteryType.LACTAT, new Hepatit("Lactat", "blue")));
        }

        for (int i = 0; i < 150; i++) {
            System.out.printf("Cell : %s\n", cells.get(i).showBactery());
        }

    }
}
