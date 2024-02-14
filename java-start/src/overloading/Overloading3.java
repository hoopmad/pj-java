package overloading;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1.2, 1.5));
    }

    // 첫 번째 add 메서드 (int)
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    // 두 번째 add 메서드 (double)
    // 위 메서드를 주석처리 하면 자동으로 double 메서드 호출
    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
