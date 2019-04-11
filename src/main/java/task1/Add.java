package task1;

public class Add extends Data implements Expression{
    public Add(Expression operand1, Expression operand2) {
        super(operand1, operand2);
        expression();
    }

    @Override
    public Integer expression() {
        return operand1.expression() + operand2.expression();
    }
}
