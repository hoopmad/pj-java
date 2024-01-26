package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료): ");
            int price = input.nextInt();

            if (price == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("구마하려는 수량을 입력하세요: ");
            int quantity = input.nextInt();
            input.nextLine(); // 숫자 입력 후의 줄바꿈 처리

            System.out.println("총 비용: " + price*quantity);
        }
    }
}
