package memento.players;

public class Circle implements Player {
    @Override
    public void doTurn(int i, int j) {
        if (Matrix.isEmpty(i, j)) {
            Matrix.putTick(i, j, 2);
        } else {
            Matrix.throwException();
        }
    }
}
