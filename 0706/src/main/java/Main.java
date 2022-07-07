import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Main {
    // static 메서드들에서 참조되는 변수는 무조건 static 키워드를 달아야 한다.
    static String line = "Test 15 lqlq 35 bad 99999 guess 34";
    public static void main(String[] args) {
        sol1();
        sol2();
        sol3();
    }
    private static void sol3() {
        String[] sBits = line.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for ( String bit : sBits ) {
            if ( bit.matches("\\d+") ) {
                numbers.add(Integer.parseInt(bit));
            }
        }
        int sum = 0;
		/*
        for ( int i = 0; i < numbers.size(); i++ ) {
        sum += numbers.get(i);
        }
        */
        for ( int number : numbers ) {
            sum += number;
        }
        System.out.println(sum);
    }
    private static void sol2() {
        String[] sBits = line.split(" ");
        int[] numbers = new int[sBits.length];
        int numbersLastIndex = -1;
        for ( String bit : sBits ) {
            if ( bit.matches("\\d+") ) {
                numbers[++numbersLastIndex] = Integer.parseInt(bit);
            }
        }
        int sum = 0;
        for ( int i = 0; i <= numbersLastIndex; i++ ) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
    private static void sol1() {
        int sum = Arrays
                .stream(line.split(" "))
                .filter((s) -> s.matches("\\d+"))
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println(sum);
    }
}