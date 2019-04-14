package strategy.personages;

import strategy.actions.ChooseAbillity;
import strategy.actions.Fly;

public class Vampire implements Personage{
    private ChooseAbillity abillity;

    @Override
    public Personage setAbillity(ChooseAbillity abillity) {
        this.abillity = abillity;
        return this;
    }
    @Override
    public String action() {
        return "Vampire can " + abillity.chooseAbillity() + " and " + new ChooseAbillity(new Fly()).chooseAbillity();
    }
}
