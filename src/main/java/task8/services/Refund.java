package task8.services;

import task8.Processor;

public class Refund extends Processor {
    public Refund(Processor nextProcessor) {
        super(nextProcessor);
    }

    public static void refundMoney(){
        System.out.println("Take away your money! " + GetPercent.getPercent());
        //return new Refund(null);
    }
}
