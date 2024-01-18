package Ch1.prac;

import java.util.Scanner;

public class no8 {
    static int sumof(int a, int b) {
        int sum = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for(int num = min; num <=max; num++) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 a, b를 포함하여 그 사이의 모든 정수의 합");
        System.out.print("정수 a:");
        int a = sc.nextInt();
        System.out.print("정수 b:");
        int b = sc.nextInt();

        System.out.println("합은 " + sumof(a,b) + "입니다.");
    }
}
