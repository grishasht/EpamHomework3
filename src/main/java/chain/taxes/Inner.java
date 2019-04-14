package chain.taxes;

public class Inner implements Taxes {
    private static final Integer taxesPercent = 10;

    public static Integer getTaxesPercent() {
        return taxesPercent;
    }

    @Override
    public Integer putMoney(Integer amount) {
        return amount;
    }
}
