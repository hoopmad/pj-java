package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalCost = 0;

        while (true) {
            String product;
            int price = 0;
            int quantity = 0;
            int total = 0;

            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();

            if (option == 1) {
                input.nextLine();
                
                System.out.print("상품명을 입력하세요: ");
                product = input.nextLine();
                System.out.print("상품의 가격을 입력하세요: ");
                price = input.nextInt();
                System.out.print("구매 수량을 입력하세요: ");
                quantity = input.nextInt();
                
                total = price * quantity;
                totalCost += total;

                System.out.println("상품명: " + product + " 가격: " + price + " 수량: " + quantity + " 합계: " + total);
            }
            else if (option == 2) {
                System.out.println("총 비용: " + totalCost);
                totalCost = 0; // 결제 후 비용 초기화
            }
            else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                System.out.println("올바른 옵션을 선택해주세요");
            }
        }

    }
}
