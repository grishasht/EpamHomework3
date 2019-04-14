package flyweight.becteries;

public class Hepatit extends Cell {
    public Hepatit(String name, String color) {
        super(name, color);
    }

    @Override
    public String showBactery() {
        return getName() + "  " + getColor();
    }
}
