package Interface;

public class Main {

    public static void main(String[] args) {

        InterfaceA ia = new InterfaceClass();
        InterfaceB ib = new InterfaceClass();
        InterfaceC ic = new InterfaceClass();

        ia.funA();
        ib.funB();
        ic.funC();
    }
}