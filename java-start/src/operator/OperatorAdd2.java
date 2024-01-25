package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        b = ++a; // a의 값을 증가 후 대입
        System.out.println("a = " + a + ", b = " + b);

        a = 1;
        b = 0;
        b = a++;  // a의 값을 대입 후 증가
        System.out.println("a = " + a + ", b = " + b);
    }
}
