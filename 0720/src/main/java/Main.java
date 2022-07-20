//code.oa.gg/java8/1081
// 문제 : 아래코드가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {

        오리 a청둥오리 = 오리공장.get("청둥");
        오리 a흰오리 = 오리공장.get("흰");
        오리 a고무오리 = 오리공장.get("고무");
        오리 a고무2오리 = 오리공장.get("고무2");
        오리 a로봇오리 = 오리공장.get("로봇");

        a청둥오리.날다();
        // 출력 : 청둥오리 : 날개로 날아갑니다.
        a청둥오리.울다();
        // 출력 : 청둥오리 : 꽥꽥!!

        a흰오리.날다();
        // 출력 : 흰오리 : 날개로 날아갑니다.
        a흰오리.울다();
        // 출력 : 흰오리 : 꽥꽥!!

        a고무오리.날다();
        // 출력 : 고무오리 : 저는 날 수 없어요. ㅠㅠ
        a고무오리.울다();
        // 출력 : 고무오리 : 삑!삑!

        a고무2오리.날다();
        // 출력 : 고무오리 : 저는 날 수 없어요. ㅠㅠ
        a고무2오리.울다();
        // 출력 : 고무오리 : Peek!Peek!

        a로봇오리.날다();
        // 출력 : 로봇오리 : 로켓파워로 날아갑니다!!
        a로봇오리.울다();
        // 출력 : 로봇오리 : 기계는 울 수 없습니다.

        a고무2오리.set비행아이템(new 로켓날개비행아이템());
        a고무2오리.날다();
        // 출력 : 고무오리 : 로켓파워로 날아갑니다!!
    }
}

class 오리 {
    private String 종류;
    private 비행아이템 a비행아이템;
    private 울음아이템 a울음아이템;

    public void set종류(String 종류) {
        this.종류 = 종류;
    }

    public String get종류() {
        return 종류;
    }

    public void set비행아이템(비행아이템 a비행아이템) {
        this.a비행아이템 = a비행아이템;
    }

    public void set울음아이템(울음아이템 a울음아이템) {
        this.a울음아이템 = a울음아이템;
    }

    public void 날다() {
        a비행아이템.사용(종류);
    }

    public void 울다() {
        a울음아이템.사용(종류);
    }
}

interface 아이템 {
    // 인터페이스에서 구상메서드를 쓰고 싶을 때, 제한적이지만 디폴트 메서드를 쓰면 가능하다.
    default void _사용(String 사용자, String 메세지)
    {
        System.out.println(사용자 + " : " + 메세지);
    }

    public void 사용(String 사용자);
}

interface 비행아이템 extends 아이템 {
}

class 날개비행아이템 implements 비행아이템 {
    public void 사용(String 사용자) {
        this._사용(사용자, "날개로 날아갑니다.");
    }
}

class 못나는비행아이템 implements 비행아이템 {
    public void 사용(String 사용자) {
        this._사용(사용자, "저는 날 수 없어요. ㅠㅠ");
    }
}

class 로켓날개비행아이템 implements 비행아이템 {
    public void 사용(String 사용자) {
        this._사용(사용자, "로켓파워로 날아갑니다!!");
    }
}

class 오리공장 {
    public static 오리 get(String 종류) {
        오리 a오리 = new 오리();
        a오리.set종류(종류);

        비행아이템 a비행아이템 = null;
        울음아이템 a울음아이템 = null;

        if ( 종류.equals("청둥") ) {
            a비행아이템 = new 날개비행아이템();
            a울음아이템 = new 꽥울음아이템();
        }
        else if ( 종류.equals("흰") ) {
            a비행아이템 = new 날개비행아이템();
            a울음아이템 = new 꽥울음아이템();
        }
        else if ( 종류.equals("고무") ) {
            a비행아이템 = new 못나는비행아이템();
            a울음아이템 = new 삑울음아이템();
        }
        else if ( 종류.equals("고무2") ) {
            a비행아이템 = new 못나는비행아이템();
            a울음아이템 = new 영어삑울음아이템();
        }
        else if ( 종류.equals("로봇") ) {
            a비행아이템 = new 로켓날개비행아이템();
            a울음아이템 = new 기계울음아이템();
        }

        a오리.set비행아이템(a비행아이템);
        a오리.set울음아이템(a울음아이템);

        return a오리;
    }
}

interface 울음아이템 extends 아이템 {
}

class 꽥울음아이템 implements 울음아이템 {
    public void 사용(String 사용자) {
        this._사용(사용자, "꽥꽥!!");
    }
}

class 삑울음아이템 implements 울음아이템 {
    public void 사용(String 사용자) {
        this._사용(사용자, "삑삑!!");
    }
}

class 영어삑울음아이템 implements 울음아이템 {
    public void 사용(String 사용자) {
        this._사용(사용자, "Peek!Peek!");
    }
}

class 기계울음아이템 implements 울음아이템 {
    public void 사용(String 사용자) {
        this._사용(사용자, "기계는 울 수 없습니다.");
    }
}