package scope; // scope는 접근 가능한 범위

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if (true) { // x 생존 시작
            int x = 20;
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료

        // System.out.println("x = " + x); // 오류: 변수 x에 접근 불가
        System.out.println("main m = " + m);
    } // m 생존 종료
}
