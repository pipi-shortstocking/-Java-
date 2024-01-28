package Ch2.prac;

import java.util.Scanner;

public class no6 {
    static int cardConv(int x, int r, char[] d) { // x: 변환하는 정수, r: 기수
        int n = ((Integer)x).toString().length(); // 변환 전의 자릿수
        int digits = 0; // 변환후 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRXTUVWXYZ";

        System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
        do {
            System.out.printf("   +");
            for (int i = 0; i < n + 2; i++)
                System.out.print('-');
            System.out.println();

            if (x / r != 0)
                System.out.printf(String.format("%%2d | %%%dd    ... %%d\n", n), r, x / r, x % r);
            else
                System.out.printf(String.format("     %%%dd    ... %%d\n", n), x / r, x % r);

            d[digits++] = dchar.charAt(x%r);
            x /= r;
        } while (x != 0);

        for(int i = 0; i < digits/2; i++) {
            char temp = d[i];
            d[i] = d[digits - i - 1];
            d[digits- i - 1] = temp;
        }

        return digits;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int retry;
        int no; // 변환하는 정수
        int cd; // 기수
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");
        do{
            do {
                System.out.print("변환하는 음이 아닌 정수: ");
                no = sc.nextInt();
            } while(no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요?(2-36): ");
                cd = sc.nextInt();
            } while(cd < 2 || cd > 36);

            int dno = cardConv(no, cd, cno);

            System.out.print(cd + "진수로 ");
            for (int i = 0; i < dno; i++) // 배열을 32자리로 만들었으므로 전체 출력 X
                System.out.print(cno[i]);
            System.out.println("입니다.");

            System.out.print("한 번 더 할까요? (1...예/0...아니요): ");
            retry = sc.nextInt();
        } while(retry == 1);
    }
}
