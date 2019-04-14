package chain;

import chain.services.GetMoney;
import chain.services.GetPercent;
import chain.services.Refund;
import chain.taxes.Inner;
import chain.taxes.Prefecial;
import chain.taxes.Usual;

public class Main {
    public static void main(String[] args) {
        Integer inner = new Inner().putMoney(10000);
        Processor processor1 = new Refund(new GetPercent(
                new GetMoney(null), Inner.getTaxesPercent(), inner));
        ((Refund) processor1).refundMoney();

        Integer usual = new Usual().putMoney(10000);
        Processor processor2 = new Refund(new GetPercent(
                new GetMoney(null), Usual.getPercent(), usual));
        ((Refund) processor2).refundMoney();

        Integer prefecial = new Prefecial().putMoney(10000);
        Processor processor3 = new Refund(new GetPercent(
                new GetMoney(null), Prefecial.getPercent(), prefecial));
        ((Refund) processor3).refundMoney();
    }
}
