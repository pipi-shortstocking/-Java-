package Ch4.prac;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stk = new Stack(64);

        while (true) {
            System.out.printf("현재 데이터 개수 : %d / %d\n", stk.size(), stk.getCapacity());
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 " +
                    "(4) 덤프 (5) 검색 (6) 비움 " +
                    "(7) 출력 (0) 종료 : ");

            int menu = sc.nextInt();
            if (menu == 0)
                break;

            String x;

            switch (menu) {
                case 1:
                    System.out.print("데이터 : ");
                    x = sc.next();
                    try {
                        stk.push(x);
                    } catch (Stack.OverflowStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try {
                        x = stk.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (Stack.EmptyStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3:
                    try {
                        x = stk.peak();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (Stack.EmptyStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4:
                    stk.dump();
                    break;

                case 5:
                    System.out.print("검색할 데이터 : ");
                    x = sc.next();
                    int idx = stk.indexOf(x);
                    if (idx >= 0)
                        System.out.println("꼭대기에서 " + (stk.size() - idx) + "번째에 있습니다.");
                    else
                        System.out.println("그 데이터가 없습니다.");
                    break;

                case 6:
                    stk.clear();
                    break;

                case 7:
                    System.out.println("용량 : " + stk.getCapacity());
                    System.out.println("데이터수 : " + stk.size());
                    System.out.println("비어 " + (stk.isEmpty() ? "있습니다." : "있지 않습니다."));
                    System.out.println("가득 차 " + (stk.isFull() ? "있습니다." : "있지 않습니다."));
                    break;
            }
        }
    }
}
