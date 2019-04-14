package strategy.personages;

import strategy.actions.ChooseAbillity;
import strategy.actions.Fly;
import strategy.actions.Walk;

public class Vampire implements Personage{
    @Override
    public String action() {
        return "Vampire can " + new ChooseAbillity(new Walk()).chooseAbillity() + " and " + new ChooseAbillity(new Fly()).chooseAbillity();
    }
}
