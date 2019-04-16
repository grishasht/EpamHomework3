package flyweight;

import flyweight.becteries.Cell;

import java.util.HashMap;
import java.util.Map;

public class CreateBactery {
    private Map<BacteryType, Cell> cellChache = new HashMap();

    public Cell createBactery(BacteryType bacteryType, Cell cell){
        Cell result = cellChache.get(cell.getName());
        if (result == null) {
            result =  cell;
            cellChache.put(bacteryType, result);
        }
        return result;
    }
}