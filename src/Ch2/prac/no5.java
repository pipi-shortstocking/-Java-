package Ch2.prac;

import java.util.Arrays;
import java.util.Scanner;

public class no5 {
    static void rcopy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;

        for(int i = 0; i < num ; i++) {
            a[i] = b[b.length - i - 1];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("b 배열 요솟수: ");
        int num_b = sc.nextInt();
        int[] b = new int[num_b];

        for(int i = 0; i < num_b; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = sc.nextInt();
        }

        System.out.print("a 배열 요솟수: ");
        int num_a = sc.nextInt();
        int[] a = new int[num_a];

        for(int i = 0; i < num_a; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        rcopy(a,b);

        System.out.println("배열 b를 배열 a에 역순으로 복사");
        System.out.println("배열 b : " + Arrays.toString(b));
        System.out.println("배열 a : " + Arrays.toString(a));
    }
}
