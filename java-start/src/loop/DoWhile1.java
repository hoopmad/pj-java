package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;
        while (i < 3) { // 조건식이 거짓이기에 아무것도 출력되지 않음
            System.out.println("현재 숫자는: " + i);
            i++;
        }
    }
}
