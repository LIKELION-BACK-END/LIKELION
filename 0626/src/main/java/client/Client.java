package client;

public class Client {

    String name;
    static int amount = 0;

    public Client(String name) {
        this.name = name;
    }

    public void saveMoney(int money) {
        amount += money;
        System.out.println("amount : " + amount);
    }

    public void spendMoney(int money) {
        amount -= money;
        System.out.println("amount : " + amount);
    }

    public void getBankInfo() {
        System.out.println("Client name : " + this.name);
        System.out.println("amount : " + amount);
    }

}
