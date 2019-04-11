package task1;

public abstract class Data implements Expression{
    protected Expression operand1;
    protected Expression operand2;

    public Data(Expression operand1, Expression operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
}
