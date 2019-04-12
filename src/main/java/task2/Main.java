package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Films:\n" +
                "1. Eternal Sunshine\n" +
                "2. The Godfather\n" +
                "3. The Avangers\n" +
                "Choose film name and language: ");
        Scanner scanner = new Scanner(System.in);
        SomeFilm.showFilm(scanner.nextLine(), scanner.nextLine());
    }
}
