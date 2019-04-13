package task5.actions;

public class ChooseAbillity {
    private static Abillity abillity;

    public ChooseAbillity(Abillity abillity) {
        this.abillity = abillity;
    }

    public void setAbillity(Abillity abillity) {
        this.abillity = abillity;
    }

    public static String chooseAbillity(){
        return abillity.useAbillity();
    }
}
