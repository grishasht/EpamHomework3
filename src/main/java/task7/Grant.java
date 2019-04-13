package task7;

import task7.grantStates.CreatedState;
import task7.grantStates.GrantState;

public class Grant {
    public static String status;
    private GrantState state = new CreatedState();

    public void setState(GrantState state) {
        this.state = state;
    }

    public GrantState getState() {
        return state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}