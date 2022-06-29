class Main {
    public static void main(String[] args) {
        // 정수가 실수 화 되어서 들어간다.
        // 5가 5.0이 되어서 들어간다.
        double d = 5;

        // `칼 리모콘`이 `무기 리모콘`화 되어서 들어간다.

        // 실제 처리
        // 무기 a무기 = (무기)new 칼();
        // (무기) => 무기리모콘 화
        무기 a무기 = new 칼();

        a무기.공격();
        // 출력 : 칼로 공격합니다.
    }
}

// 리모콘 전용 클래스
class 무기 {
    // 버튼 전용 메서드(함수)
    void 공격() {

    }
}

class 칼 extends 무기 {
    void 공격() {
        System.out.println("칼로 공격합니다.");
    }
}

// static은 this를 사용할 수 없다
// 사람 is 동물 ( o ) 사람은 동물이다. *is => extends
// 동물 is 사람 ( x ) 동물은 사람이다.
// 다중상속은 자바에서 불가능