package Interface;

public class InterfaceClass implements InterfaceA, InterfaceB, InterfaceC {

    public InterfaceClass() {
        System.out.println("-- Interface.InterfaceClass 생성자 --");
    }

    @Override
    public void funA() {
        System.out.println("-- funA() --");
    }

    @Override
    public void funB() {
        System.out.println("-- funB() --");
    }

    @Override
    public void funC() {
        System.out.println("-- funC() --");
    }
}
