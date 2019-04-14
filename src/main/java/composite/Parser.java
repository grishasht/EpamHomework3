package composite;

import java.util.Scanner;

public class Parser {

    public static Integer[] createExpression(){
        Scanner scanner = new Scanner(System.in);
        Integer[] buffer = new Integer[6];

        System.out.println("(<> + <>) * <> + <> * (<> + <>)");
        for (int i = 0; i < 6; i++) {
            buffer[i] = scanner.nextInt();
        }

        return buffer;
    }
}
