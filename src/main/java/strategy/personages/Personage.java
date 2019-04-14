package strategy.personages;

import strategy.actions.ChooseAbillity;

public interface Personage {
    String action();
    Personage setAbillity(ChooseAbillity abillity);
}
