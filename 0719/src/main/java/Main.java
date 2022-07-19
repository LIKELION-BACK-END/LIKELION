public class Main {
    public static void main(String[] args) {
        try {
            int rs = 계산기.나누다(10, 0);
            System.out.println(rs);
        } catch (ArithmeticException e) {
            System.out.println("0이하로는 나눌수 없습니다 ㅠ ");
        } catch (Exception e) {
            System.out.println("알수 없는 오류가 발생하였습니다.");
        }
    }
}

class 계산기 {
    // 개조심
    static int 나누다(int a, int b) throws ArithmeticException {
        int rs = a / b;

        return rs;
    }
}