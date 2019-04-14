package composite;

public class Multiply extends Data implements Expression{
    public Multiply(Expression operand1, Expression operand2) {
        super(operand1, operand2);
        expression();
    }

    @Override
    public Integer expression() {
        return operand1.expression() * operand2.expression();
    }
}
