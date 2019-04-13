package task3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IOException {
        Article wiki = new WikiArticle();
        Scanner scanner = new Scanner(System.in);

        String test1 = "something";
        String test2 = new String("something");

        System.out.println(test1);
        System.out.println(test2);

        System.out.println("1 - show articles\n" +
                "2 - edit articles\n" +
                "3 - exit" +
                "Chose: ");

        while (true) {
            Integer userChoice = scanner.nextInt();
            if (userChoice == 1) {
                System.out.println("1 - Elvis 2 - Tesla 3 - Intel");
                userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        wiki.showArticle("Elvis");
                        break;
                    case 2:
                        wiki.showArticle("Tesla");
                        break;
                    case 3:
                        wiki.showArticle("Intel");
                        break;
                    default:
                        throw new IllegalArgumentException("Incorrect input");
                }
            } else if (userChoice == 2) {
                System.out.println("1 - Elvis 2 - Tesla 3 - Intel");
                userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        wiki.redactArticle("Elvis");
                        break;
                    case 2:
                        wiki.redactArticle("Tesla");
                        break;
                    case 3:
                        wiki.redactArticle("Intel");
                        break;
                    default:
                        throw new IllegalArgumentException("Incorrect input");
                }
            }else break;
        }

    }

}
