/*
문제 : 사람 객체의 `안녕`이 `button.click();`에 의해 실행되도록 해주세요.
조건 : Button에는 `사람` 이라는 언급이 없어야 합니다.
*/
class Main {
    public static void main(String[] args) {
        Button button = new Button();
        button.setListener(new 사람());
        button.setListener(new 코끼리());
        button.click();
    }
}

interface Listener {
    public void listen(String msg);
}

class Button {
    private Listener aListener;
    public void setListener(Listener aListener) {
        this.aListener = aListener;
    }
    public void click() {
        aListener.listen("버튼 클릭 되었네요.");
    }
}

class 사람 implements Listener {
    @Override
    public void listen(String msg) {
        안녕();
    }
    public void 안녕() {
        System.out.println("사람, 안녕!");
    }
}

class 코끼리 implements Listener {
    public void listen(String msg) {
        System.out.println("꼬끼리가 버튼이 클릭되었다는 소식을 받았습니다,\n메세지 : " + msg);
    }
}