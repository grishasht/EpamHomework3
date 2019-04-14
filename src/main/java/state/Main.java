package state;

public class Main {
    public static void main(String[] args) {
        Grant grant = new Grant();

      //  grant.setState(new CreatedState());
        grant.printStatus();
        grant.nextState();
        grant.printStatus();
        grant.status = "approve";
        grant.nextState();
        grant.printStatus();
        grant.previousState();
        grant.printStatus();
        grant.previousState();
        grant.printStatus();
        grant.previousState();
    }
}
