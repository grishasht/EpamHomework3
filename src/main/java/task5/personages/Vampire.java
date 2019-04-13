package task5.personages;

import task5.actions.ChooseAbillity;
import task5.actions.Fly;
import task5.actions.Walk;

public class Vampire implements Personage{
    @Override
    public String action() {
        return "Vampire can " + new ChooseAbillity(new Walk()).chooseAbillity() + " and " + new ChooseAbillity(new Fly()).chooseAbillity();
    }
}
