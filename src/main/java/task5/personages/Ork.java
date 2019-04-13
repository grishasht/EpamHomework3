package task5.personages;

import task5.actions.ChooseAbillity;
import task5.actions.Walk;

public class Ork implements Personage{
    @Override
    public String action() {
        return "Ork can " + new ChooseAbillity(new Walk()).chooseAbillity();
    }
}
