package task6;

public class Main {
    public static void main(String[] args) {
        Mail mail = new Mail();
        for (int i = 0; i < 10; i++) {
            mail.addSubscriber(new SubscriberChannel());
        }
        mail.sendNews("Jon Snow is alive!");

        for (String str: mail.showNews()) {
            System.out.println(str);
        }
    }
}
