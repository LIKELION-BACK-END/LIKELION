package Interface2;

public class ToyAirplane implements Toy {

    @Override
    public void walk() {
        System.out.println("The airplane can not walk.");
    }

    @Override
    public void run() {
        System.out.println("The airplane can not run.");
    }

    @Override
    public void alarm() {
        System.out.println("The airplane has function.");
    }

    @Override
    public void light() {
        System.out.println("The airplane no light function.");
    }
}
