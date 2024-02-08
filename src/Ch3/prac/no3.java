package Ch3.prac;

import java.util.Scanner;

public class no3 {
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] == key)
                idx[cnt++] = i;
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];                        // 요솟수가 num인 배열
        int[] arr_idx = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색 값 : ");                    // 키값을 읽력받음
        int ky = stdIn.nextInt();

        int cnt = searchIdx(x, num, ky, arr_idx);        // 배열 x안의 값이 ky인 요소를 arr_idx에 copy

        if (cnt == 0)
            System.out.println("그 값의 요소는 존재하지 않습니다.");
        else
            for (int i = 0; i < cnt; i++)
                System.out.println("그 값은 " + "x[" + arr_idx[i] + "]에 있습니다.");
    }
}
