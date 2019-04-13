package task5;

import task5.personages.Elf;
import task5.personages.Ork;
import task5.personages.Pegasus;
import task5.personages.Vampire;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Elf().action());
        System.out.println(new Ork().action());
        System.out.println(new Pegasus().action());
        System.out.println(new Vampire().action());
    }
}
