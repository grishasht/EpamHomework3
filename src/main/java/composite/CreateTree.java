package composite;


public class CreateTree{
    private static Integer[] operands = Parser.createExpression();

    public static Expression calculateExpression(){
        return new Add(
                     new Multiply(
                            new Add(new Single(operands[0]), new Single(operands[1])),
                            new Single(operands[2])
                    ),
                    new Multiply(
                            new Add(new Single(operands[4]), new Single(operands[5])),
                            new Single(operands[3])
                    )
                );
    }
}
