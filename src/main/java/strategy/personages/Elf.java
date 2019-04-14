package strategy.personages;

import strategy.actions.ChooseAbillity;

public class Elf implements Personage{
    private ChooseAbillity abillity;

    @Override
    public Personage setAbillity(ChooseAbillity abillity) {
        this.abillity = abillity;
        return this;
    }

    @Override
    public String action() {
        return "Elf can " + abillity.chooseAbillity();
    }
}
