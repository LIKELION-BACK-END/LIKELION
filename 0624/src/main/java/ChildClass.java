// 메소드 선언
public class ChildClass {

    public String name;
    public int age;
    public String gender;

    public ChildClass() {
        System.out.println("-- ChildClass 생성자 --");
    }

    public void setInfo(String n, String g, int a) {
        System.out.println("-- setInfo() 시작 --");
        name = n;
        gender = g;
        age = a;
    }

    public void getInfo() {
        System.out.println("-- getInfo() 시작 --");
        System.out.println("name : " + name);
        System.out.println("gender : " + gender);
        System.out.println("age : " + age);
    }

    // private 내부에서만 사용가능
    private void mySecret() {
        System.out.println("-- mySecret() --");
    }

}