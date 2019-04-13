package task7.grantStates;

import task7.Grant;

public interface GrantState {
    void next(Grant grant);
    void prev(Grant grant);
    void printStatus();
}
