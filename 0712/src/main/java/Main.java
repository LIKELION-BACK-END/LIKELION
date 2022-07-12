// 문제 : 아래와 같이 실행되게 해주세요.

class Main {
    public static void main(String[] args) {
        IntArr intArr1 = new IntArr1();
        System.out.println("배열의 길이 : " + intArr1.length);
        // 출력 => 배열의 길이 : 1
        intArr1.setData(0, 20);
        System.out.println(intArr1.getData(0));
        // 출력 => 20

        IntArr intArr3 = new IntArr3();
        System.out.println("배열의 길이 : " + intArr3.length);
        // 출력 => 배열의 길이 : 3
        intArr3.setData(0, 20);
        intArr3.setData(1, 40);
        intArr3.setData(2, 60);
        System.out.println(intArr3.getData(0));
        // 출력 => 20
        System.out.println(intArr3.getData(1));
        // 출력 => 40
        System.out.println(intArr3.getData(2));
        // 출력 => 60
    }
}

abstract class IntArr {
    int length;

    abstract void setData(int index, int value);
    abstract int getData(int index);
}

class IntArr1 extends IntArr {
    int data0;

    IntArr1() {
        length = 1;
    }

    void setData(int index, int value) {
        this.data0 = value;
    }

    int getData(int index) {
        return this.data0;
    }
}

class IntArr3 extends IntArr {
    int data0;
    int data1;
    int data2;

    IntArr3() {
        length = 3;
    }

    void setData(int index, int value) {
        if ( index == 0 ) {
            this.data0 = value;
        }
        else if ( index == 1 ) {
            this.data1 = value;
        }
        else if ( index == 2 ) {
            this.data2 = value;
        }
    }

    int getData(int index) {
        if ( index == 0 ) {
            return this.data0;
        }
        else if ( index == 1 ) {
            return this.data1;
        }
        else if ( index == 2 ) {
            return this.data2;
        }

        return 0;
    }
}