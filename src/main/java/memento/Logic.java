package memento;

import memento.players.Matrix;

import java.util.Scanner;

public class Logic {
    public void playGame(){
        Turn turn = new Turn();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whose first turn?");
        String firstPlayer = scanner.nextLine();
        Boolean crossTurn = false;
        Boolean circleTurn = false;
        if (firstPlayer.toUpperCase().equals("CROSS")) crossTurn = true;
        else circleTurn = true;
        int i = 0;
        while (i < 9) {
            if (crossTurn) {
                circleTurn = true;
                crossTurn = false;
                System.out.println("Crosses turn! Put coordinates <x, y>: ");
                turn.setPositionX(scanner.nextInt());
                turn.setPositionY(scanner.nextInt());
                turn.setPlayer("cross");
                turn.doTurn();
                Matrix.printMatrix();
            }else if (circleTurn){
                circleTurn = false;
                crossTurn = true;
                System.out.println("Circle turn! Put coordinates <x, y>: ");
                turn.setPositionX(scanner.nextInt());
                turn.setPositionY(scanner.nextInt());
                turn.setPlayer("circle");
                turn.doTurn();
                Matrix.printMatrix();
            }
            turn.preview();
            //scanner.nextLine();
            System.out.println("Make turn undo? Y/n");
            if (scanner.next().equals("y")) {
                turn.undoTurn();
                Matrix.printMatrix();
                i--;
            }
        i++;
        }
    }
}
