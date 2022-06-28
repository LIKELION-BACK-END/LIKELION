public class Main {

    public static void main(String[] args) {

        Outer oc = new Outer();
        System.out.println("oc.num : " + oc.num);
        System.out.println("oc.str1 : " + oc.str1);

        System.out.println();

        // 맴버 inner 클래스
        Outer.InnerClass in = oc.new InnerClass();
        System.out.println("in.num : " + in.num);
        System.out.println("in.str2 : " + in.str2);

        System.out.println();

        // static inner 클래스
        Outer.SInnerClass si = new Outer.SInnerClass();
        System.out.println("si.num : " + si.num);
        System.out.println("si.str3 : " + si.str3);

        System.out.println();

        // 익명(anonymous) 클래스
        new Anonymous() {

            @Override
            public void method() {
                System.out.println("-- Anonymous Override method START --");
            };
        }.method();
    }
}
