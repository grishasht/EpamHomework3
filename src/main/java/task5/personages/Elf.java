package task5.personages;

import task5.actions.Abillity;
import task5.actions.ChooseAbillity;
import task5.actions.Fly;

public class Elf implements Personage{
    @Override
    public String action() {
        return "Elf can " + new ChooseAbillity(new Fly()).chooseAbillity();
    }
}
