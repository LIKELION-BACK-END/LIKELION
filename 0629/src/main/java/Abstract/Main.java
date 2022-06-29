package Abstract;

public class Main {
    public static void main(String[] args) {

        Bank myBank = new MyBank("박영승", "1000-1000-1000", 10000);

        myBank.deposit();
        myBank.withdraw();
        myBank.installmentSavings();
        myBank.cancellation();

        System.out.println();

        myBank.getInfo();
    }
}
