package Ch2.prac;

import java.util.Arrays;
import java.util.Scanner;

public class no4 {
    static void copy(int[] a, int[] b) {
        for(int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();

        int[] a = new int[num];
        int[] b = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = sc.nextInt();
        }

        copy(a,b);

        System.out.println("배열 b를 배열 a에 복사");
        System.out.println("배열 b : " + Arrays.toString(b));
        System.out.println("배열 a : " + Arrays.toString(a));
    }
}
