package state.grantStates;

import state.Grant;

public class ReviewingState implements GrantState{

    @Override
    public void next(Grant grant) {
        switch (Grant.status.toUpperCase()){
            case "APPROVE": grant.setState(new ApprovedState()); break;
            case "REFUSE": grant.setState(new RefusedState()); break;
            default:
                try {
                    throw new NoSuchFieldException("No such variant");
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
        }
    }

    @Override
    public void prev(Grant grant) {
        grant.setState(new CreatedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Grant is on review status!");
    }
}
