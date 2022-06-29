package Interface2;

public class Main {

    public static void main(String[] args) {

        Toy toyAirplane = new ToyAirplane();
        Toy toyRobot = new ToyRobot();

        Toy[] toy = {toyAirplane, toyRobot};

        for (Toy value : toy) {
            value.walk();
            value.run();
            value.alarm();
            value.light();

            System.out.println();
        }
    }
}
