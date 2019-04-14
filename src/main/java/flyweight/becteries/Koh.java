package flyweight.becteries;

public class Koh extends Cell {
    public Koh(String name, String color) {
        super(name, color);
    }

    @Override
    public String showBactery() {
        return getName() + "  " + getColor();
    }
}
