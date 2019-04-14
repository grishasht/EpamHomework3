package flyweight;

import flyweight.becteries.Cell;
import flyweight.becteries.Hepatit;
import flyweight.becteries.Koh;
import flyweight.becteries.Lactat;

import java.util.HashMap;
import java.util.NoSuchElementException;

public class CreateBactery {
    private HashMap<BacteryType, Cell> examples = new HashMap();

    public Cell createBactery(BacteryType bacteryType){
        Cell cell;
        switch (bacteryType){
            case HEPATIT: cell = new Hepatit("Hepatit", "Green"); break;
            case KOH: cell =new Koh("Koh", "Yellow"); break;
            case LACTAT: cell = new Lactat("Lactat", "Blue"); break;
            default: throw new NoSuchElementException("No such bactery");
        }
        examples.put(bacteryType, cell);
        return cell;
    }
}
