package Ch3.prac;

import java.util.Scanner;

public class no2 {
    static int seqSearchSenPrint(int[] a, int n, int key) {
        System.out.print("   |");
        for(int i = 0; i < n; i++)
            System.out.printf("%4d", i);
        System.out.println();

        System.out.print("---+");
        for (int j = 0; j < 4 * n + 2; j++)
            System.out.print("-");
        System.out.println();

        for(int k = 0; k < n; k++) {
            System.out.print("   |");
            System.out.printf(String.format("%%%ds*\n", (k * 4) + 3), "");
            System.out.printf("%3d|", k);
            for(int t = 0; t < n; t++)
                System.out.printf("%4d", a[t]);
            System.out.println("\n   |");

            if(a[k] == key)
                return k;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];                        // 요솟수가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색 값 : ");                    // 키값을 읽력받음
        int ky = stdIn.nextInt();

        int idx = seqSearchSenPrint(x, num, ky);              // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("검색 값의 요소가 없습니다.");
        else
            System.out.println("검색 값은 x[" + idx + "]에 있습니다.");
    }
}
