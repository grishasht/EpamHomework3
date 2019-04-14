package task8.taxes;

import task8.Processor;

public class Usual implements Taxes{
    public static Integer getPercent() {
        return percent;
    }

    private static final Integer percent = 15;

    @Override
    public Integer putMoney(Integer amount) {
        return amount;
    }
}
