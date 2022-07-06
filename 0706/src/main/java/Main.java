// 문제 : 구성(전사는 무기로 구성된다.)을 사용하여 중복을 제거해주세요.

class Main {
    public static void main(String[] args) {
        전사타입A a전사타입A = new 전사타입A();
        a전사타입A.공격();

        전사타입B a전사타입B = new 전사타입B();
        a전사타입B.공격();

        전사타입C a전사타입C = new 전사타입C();
        a전사타입C.공격();

        전사타입D a전사타입D = new 전사타입D();
        a전사타입D.공격();
    }
}

abstract class 전사 {
    무기 a무기;
    void 공격() {
        a무기.사용();
    }
}

class 전사타입A extends 전사 {
    전사타입A() {
        a무기 = new 칼();
    }
}
class 전사타입B extends 전사 {
    전사타입B() {
        a무기 = new 칼();
    }
}
class 전사타입C extends 전사 {
    전사타입C() {
        a무기 = new 활();
    }
}
class 전사타입D extends 전사 {
    전사타입D() {
        a무기 = new 활();
    }
}

// abstract => 무기 클래스는 아쉽게도 `new 무기();` 될 일은 없고 리모콘 제작용으로만 쓰인다.
abstract class 무기 {
    // abstract => 사용 메서드는 슬프게도 리모콘 버튼용으로만 쓰인다.
    abstract void 사용();
}

class 칼 extends 무기 {
    void 사용() {
        System.out.println("칼로 공격");
    }
}

class 활 extends 무기 {
    void 사용() {
        System.out.println("활로 공격");
    }
}