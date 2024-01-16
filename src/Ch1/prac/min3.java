package Ch1.prac;

import java.util.Scanner;

public class min3 {
    static int min3(int a, int b, int c) {
        int min = a;

        if(min > b) min = b;
        if(min > c) min = c;

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("세 정수의 최솟값을 구합니다.");
        System.out.print("a의 값 : ");  a = sc.nextInt();
        System.out.print("b의 값 : ");  b = sc.nextInt();
        System.out.print("c의 값 : ");  c = sc.nextInt();

        int min = min3(a, b, c);

        System.out.println("최솟값은 " + min);
    }
}
