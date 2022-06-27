public class SecondChild extends Parent {

    public SecondChild() {
        System.out.println("SecondChild 생성자");
    }

    @Override
    public void makePizza() {
        System.out.println("-- SecondChild's makePizza() START --");
    }
}
