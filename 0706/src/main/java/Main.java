// 문제 : 온라인 게임을 구현해주세요.
// 조건 : 전사객체를 만들고 순서대로 칼, 창, 지팡이로 공격하게 해주세요.
// 단 : 전사는 무기라는 것이 존재한다는 것은 알지만 칼, 창, 지팡이에 대해선 몰라야 합니다.

class Main {
    public static void main(String[] args) {
        // 구현 시작
        전사 a전사 = new 전사();

        a전사.a무기 = new 칼();
        a전사.공격();

        a전사.a무기 = new 창();
        a전사.공격();

        a전사.a무기 = new 지팡이();
        a전사.공격();

        a전사.a무기 = new 전설의_지팡이();
        a전사.공격();
        // 구현 끝

        // 출력
    /*
    칼(으)로 공격합니다.
    데미지 : 78
    창(으)로 공격합니다.
    데미지 : 80
    지팡이(으)로 공격합니다.
    데미지 : 12
    전설의_지팡이(으)로 공격합니다.
    데미지 : 120
    */
    }
}

/* 구현 시작 */
class 전사 {
    무기 a무기;

    void 공격() {
        a무기.사용();
    }
}

abstract class 무기 {
    int damage;
    String name;

    void 사용() {
        System.out.println(name + "(으)로 공격합니다.");
        System.out.println("데미지 : " + damage);
    }
}

class 창 extends 무기 {
    창() {
        this.name = "창";
        this.damage = 93;
    }
}

class 칼 extends 무기 {
    칼() {
        this.name = "칼";
        this.damage = 73;
    }
}

class 지팡이 extends 무기 {
    지팡이() {
        this.name = "지팡이";
        this.damage = 12;
    }
}

class 전설의_지팡이 extends 무기 {
    전설의_지팡이() {
        this.name = "전설의_지팡이";
        this.damage = 22;
    }
}

/* 구현 끝 */