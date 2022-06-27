public class FirstChild extends Parent {

    int openYear = 2000;

    public void getOpenYear() {
        System.out.println("Child's Open Year : " + this.openYear);
        System.out.println("Parent's Open Year : " + super.openYear);
    }

    public FirstChild() {
        System.out.println("FirstChild 생성자");
    }

    @Override
    public void makePizza() {
        System.out.println("-- more delicious makePizza() START --");
    }
}
