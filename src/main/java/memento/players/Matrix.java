package memento.players;

public class Matrix {
    private static Integer[][] matrix = {{0, 0, 0},
                                         {0, 0, 0},
                                         {0, 0, 0}};

    public static Boolean isEmpty(int i, int j){
        return matrix[i][j] == 0 ? true : false;
    }

    public static void putTick(int i, int j, int mark){
        matrix[i][j] = mark;
    }

    public static void throwException(){
        System.out.println("No such position!");
    }

    public static void putZero(int i, int j){
        matrix[i][j] = 0;
    }

    public static void printMatrix(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void resetMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public static Integer[][] getMatrix() {
        return matrix;
    }
}
