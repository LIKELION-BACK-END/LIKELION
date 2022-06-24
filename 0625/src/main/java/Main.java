public class Main {

    public static void main(String[] args) {

        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();

        System.out.println("obj1 => " + obj1);
        System.out.println("obj2 => " + obj2);
        System.out.println("obj3 => " + obj3);

        if (obj1 == obj2) {
            System.out.println("obj1 == obj2");
        } else {
            System.out.println("obj1 != obj2");
        }

        if (obj2 == obj3) {
            System.out.println("obj2 == obj3");
        } else {
            System.out.println("obj2 != obj3");
        }

        if (obj3 == obj1) {
            System.out.println("obj3 == obj1");
        } else {
            System.out.println("obj3 != obj1");
        }

        System.out.println("obj1 ------> " + obj1);

        /* 레퍼런스 X
        obj1.getInfo();
        obj1 = null;
        obj1.getInfo(); */


    }
}