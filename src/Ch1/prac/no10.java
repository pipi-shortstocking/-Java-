package Ch1.prac;

import java.util.Scanner;

public class no10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("양의 정수를 입력하세요 : ");
        int num = sc.nextInt();
        int cnt = 0;

        while(num > 0) {
            num /= 10;
            cnt ++;
        }

        System.out.println("그 수는 " + cnt + "자리 입니다.");
    }
}
