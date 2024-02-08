package Ch3.prac;

import java.util.Scanner;

public class no4 {
    //--- 요솟수가 n개인 배열 a에서 key와 같은 요소를 이진 검색 ---//
    static int binSearchPrint(int[] a, int n, int key) {
        System.out.print("   |");
        for(int i = 0; i < n; i++)
            System.out.printf("%4d", i);
        System.out.println();

        System.out.print("---+");
        for (int j = 0; j < 4 * n + 2; j++)
            System.out.print("-");
        System.out.println();

        int pl = 0;            // 검색 범위의 첫 인덱스
        int pr = n - 1;        // 검색 범위의 끝 인덱스

        do {
            int pc = (pl + pr) / 2;     // 중앙 요소 인덱스
            System.out.print("   |");
            if (pl != pc)
                System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4), "", "");
            else
                System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");

            if (pc != pr)
                System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
            else
                System.out.println("->");
            System.out.printf("%3d|", pc);

            for(int k = 0; k < n; k++)
                System.out.printf("%4d", a[k]);
            System.out.println("\n   |");

            if (a[pc] == key)
                return pc;              // 검색 성공!
            else if (a[pc] < key)
                pl = pc + 1;            // 검색 범위를 뒤쪽 절반으로 좁힘
            else
                pr = pc - 1;            // 검색 범위를 앞쪽 절반으로 좁힘
        } while (pl <= pr);

        return -1;                      // 검색 실패
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];              // 요솟수가 num인 배열

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: ");        // 첫 요소 읽력받음
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]);    // 바로 앞의 요소보다 작으면 다시 입력받음
        }

        System.out.print("검색할 값: ");       // 킷값을 읽어 들임
        int ky = stdIn.nextInt();

        int idx = binSearchPrint(x, num, ky);    // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println(ky + "의 요소가 없습니다.");
        else
            System.out.println(ky + "는 x[" + idx + "]에 있습니다.");
    }
}
