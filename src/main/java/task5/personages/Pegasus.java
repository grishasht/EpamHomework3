package task5.personages;

import task5.actions.ChooseAbillity;
import task5.actions.Fly;

public class Pegasus implements Personage{
    @Override
    public String action() {
        return "Pegasus can " + new ChooseAbillity(new Fly()).chooseAbillity();
    }
}
