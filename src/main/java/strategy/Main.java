package strategy;

import strategy.personages.Elf;
import strategy.personages.Ork;
import strategy.personages.Pegasus;
import strategy.personages.Vampire;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Elf().action());
        System.out.println(new Ork().action());
        System.out.println(new Pegasus().action());
        System.out.println(new Vampire().action());
    }
}
