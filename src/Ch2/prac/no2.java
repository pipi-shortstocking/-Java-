package Ch2.prac;

import java.util.Arrays;
import java.util.Scanner;

public class no2 {
    static void swap(int[] x, int start, int end) {
        System.out.println(Arrays.toString(x));
        System.out.println("a[" + start + "]과 a[" + end + "]을 교환합니다.");

        int temp = x[start];
        x[start] = x[end];
        x[end] = temp;
    }

    static void reverse(int[] x) {
        for(int i = 0; i < x.length / 2; i++) {
            swap(x, i, x.length - i - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();

        int[] x = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        reverse(x);

        System.out.println(Arrays.toString(x));
        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
