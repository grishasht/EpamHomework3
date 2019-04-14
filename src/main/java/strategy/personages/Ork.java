package strategy.personages;

import strategy.actions.ChooseAbillity;
import strategy.actions.Walk;

public class Ork implements Personage{
    @Override
    public String action() {
        return "Ork can " + new ChooseAbillity(new Walk()).chooseAbillity();
    }
}
