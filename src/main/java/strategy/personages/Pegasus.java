package strategy.personages;

import strategy.actions.ChooseAbillity;
import strategy.actions.Fly;

public class Pegasus implements Personage{
    @Override
    public String action() {
        return "Pegasus can " + new ChooseAbillity(new Fly()).chooseAbillity();
    }
}
