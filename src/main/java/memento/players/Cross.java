package memento.players;

import java.util.NoSuchElementException;

public class Cross implements Player {
    @Override
    public void doTurn(int i, int j) {
        if (Matrix.isEmpty(i, j)) {
            Matrix.putTick(i, j, 1);
        } else {
            Matrix.throwException();
        }
    }
}
