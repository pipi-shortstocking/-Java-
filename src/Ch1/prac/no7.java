package Ch1.prac;

import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1에서 n까지의 정수 합");
        System.out.print("정수 n을 입력하세요 : ");
        int n = sc.nextInt();

        int sum = (1 + n) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
        System.out.println("총합은 " + sum + "입니다.");
    }
}
