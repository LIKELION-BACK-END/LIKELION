public class Bicycle {

    public String color;
    public int price;

    public Bicycle() {
        System.out.println("Bicycle 생성자");
    }

    public void info() {
        System.out.println(" -- info() -- ");
        System.out.println("color : " + color);
        System.out.println("price : " + price);

    }

}
