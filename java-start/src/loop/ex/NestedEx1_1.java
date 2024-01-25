package loop.ex;

public class NestedEx1_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 81; i++) {
            int row = (i - 1) / 9 + 1;
            int column = (i - 1) % 9 + 1;
            System.out.println(row + " * " + column + " = " + row * column);
        }
    }
}
