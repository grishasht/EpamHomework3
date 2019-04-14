package strategy.personages;

import strategy.actions.ChooseAbillity;
import strategy.actions.Fly;

public class Elf implements Personage{
    @Override
    public String action() {
        return "Elf can " + new ChooseAbillity(new Fly()).chooseAbillity();
    }
}
