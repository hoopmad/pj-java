package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        // 자동 형변환 (묵시적 형변환)
        longValue = intValue;
        System.out.println("longValue = " + longValue);

        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 2000L;
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
