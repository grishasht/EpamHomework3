package flyweight.becteries;

public abstract class Cell {
    private String name;
    private String color;
    public abstract String showBactery();

    public Cell(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
