package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("학생수를 입력하세요:");
        int[][] scores = new int[input.nextInt()][3]; // 아니면 따로 count 변수
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
            for (int k = 0; k < scores[i].length; k++) {
                System.out.print(subjects[k] + " 점수:");
                scores[i][k] = input.nextInt();
            }
        }
        
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int k = 0; k < scores[i].length; k++) {
                total += scores[i][k];
            }
            double avg = (double) total / scores[i].length;
            System.out.println((i+1) + "번 학생의 총점: " + total + ", 평균: " + avg);
        }
    }
}
