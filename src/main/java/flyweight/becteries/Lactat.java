package flyweight.becteries;

public class Lactat extends Cell {
    public Lactat(String name, String color) {
        super(name, color);
    }

    @Override
    public String showBactery() {
        return getName() + "  " + getColor();
    }
}
