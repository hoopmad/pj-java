package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        intValue = (int) doubleValue;
        System.out.println(intValue);

        int z = (int) 10.5;
        System.out.println(z);
    }
}
