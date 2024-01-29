package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] scores = new int[4][3];
        int[] total = new int[scores.length];
        double[] avg = new double[scores.length];
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
            
            System.out.print("국어 점수:");
            scores[i][0] = input.nextInt();
            System.out.print("영어 점수:");
            scores[i][1] = input.nextInt();
            System.out.print("수학 점수:");
            scores[i][2] = input.nextInt();
            
            total[i] = scores[i][0] +  scores[i][1] + scores[i][2];
            avg[i] = (double) total[i] / scores[i].length;
        }
        
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "번 학생의 총점: " + total[i] + ", 평균: " + avg[i]);
        }
    }
}
