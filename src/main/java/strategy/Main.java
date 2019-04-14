package strategy;

import com.sun.org.apache.xpath.internal.operations.Or;
import strategy.actions.ChooseAbillity;
import strategy.actions.Fly;
import strategy.actions.Walk;
import strategy.personages.*;

public class Main {
    public static void main(String[] args) {
        String elf = new Elf().setAbillity(new ChooseAbillity(new Walk())).action();
        String ork = new Ork().setAbillity(new ChooseAbillity(new Walk())).action();
        String pegasus = new Pegasus().setAbillity(new ChooseAbillity(new Fly())).action();
        String vampire = new Vampire().setAbillity(new ChooseAbillity(new Walk())).action();

        System.out.println(elf);
        System.out.println(ork);
        System.out.println(pegasus);
        System.out.println(vampire);
    }
}
