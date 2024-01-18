package Ch1.prac;

import java.util.Scanner;

public class no9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("a값: ");
        a = sc.nextInt();

        while(true) {
            System.out.print("b값: ");
            b = sc.nextInt();

            if(b > a) break;
            System.out.println("a보다 큰 값을 입력하세요!");
        }

        System.out.println("b - a는 " + (b - a) + "입니다.");
    }
}
