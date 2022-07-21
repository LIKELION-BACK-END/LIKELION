public class Main {
    public static void main(String[] args) {
        Button aButton = new Button();
        aButton.setClickEventListener(new 고양이());
        aButton.fireClick();
        // 나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.setClickEventListener(new 개());
        aButton.fireClick();
        // 나(개)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.setClickEventListener(new 부엉이());
        // 나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.fireClick();
    }
}
class Button {
    private Object aListener;

    public void setClickEventListener(Object aListener) {
        this.aListener = aListener;
    }

    public void fireClick() {
        if ( aListener instanceof 고양이 ) {
            ((고양이)aListener).클릭이벤트에응답();
        }
        else if ( aListener instanceof 개 ) {
            ((개)aListener).응답();
        }
        else if ( aListener instanceof 부엉이 ) {
            ((부엉이)aListener).onClick();
        }
    }
}
class 고양이 {
    public void 클릭이벤트에응답() {
        System.out.println("나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
}

class 개 {
    public void 응답() {
        System.out.println("나(개)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
}

class 부엉이 {
    public void onClick() {
        System.out.println("나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
}