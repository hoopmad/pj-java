package loop;

public class For3 {
    public static void main(String[] args) {
        int i = 1;
        int endNum = 30;
        int sum = 0;
        while (i <= endNum) {
            sum += i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
    }
}
