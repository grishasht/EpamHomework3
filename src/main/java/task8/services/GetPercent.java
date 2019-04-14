package task8.services;

import task8.Processor;

public class GetPercent extends Processor {
    private static int sum;
    private static int percent;

    public GetPercent(Processor nextProcessor, int percent, int amount) {
        super(nextProcessor);
        this.sum = GetMoney.setMoney(amount);
        this.percent = percent;
    }

    public static Float getPercent(){
        return (float)sum *(100 - percent) / 100;
    }
}
