package strategy.actions;

public class ChooseAbillity {
    private static Abillity abillity;

    public ChooseAbillity(Abillity abillity) {
        this.abillity = abillity;
    }

    public static void setAbillity(Abillity abillity) {
        ChooseAbillity.abillity = abillity;
    }

    public static String chooseAbillity(){
        return abillity.useAbillity();
    }
}
