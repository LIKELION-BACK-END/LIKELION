import client.Client;

public class Main {
    public static void main(String[] args) {

        Client parkBank = new Client("박영승");
        parkBank.saveMoney(100);

        Client jungBank = new Client("정승원");
        jungBank.saveMoney(300);

        jungBank.getBankInfo();

        parkBank.spendMoney(400);

        jungBank.getBankInfo();

    }
}
