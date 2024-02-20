package Ch4.prac;

import Ch4.IntStack;

import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);    // 최대 64 개를 푸시할 수 있는 스택

        while (true) {
            System.out.println(); // 메뉴 구분을 위한 빈 행 추가
            System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1)푸시　(2)팝　(3)피크　(4)덤프 (5)클리어 (6)검색 (7)비어 있는지 (8)가득 찼는지　(0)종료: ");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;
            int result;
            switch (menu) {
                case 1:                                // 푸시
                    System.out.print("데이터: ");
                    x = stdIn.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:                                // 팝
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 3:                                // 피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 4:                                // 덤프
                    s.dump();
                    break;

                case 5:                                 // 클리어
                    s.clear();
                    break;

                case 6:                                 // 검색
                    System.out.print("데이터: ");
                    result = s.indexOf(stdIn.nextInt());

                    if(result != -1) {
                        System.out.println("입력한 데이터의 위치는 " + result + "입니다.");
                    }
                    else {
                        System.out.println("입력한 데이터는 해당 스택에 없습니다.");
                    }
                    break;

                case 7:                                 // 비어 있는지
                    if(s.isEmpty()) {
                        System.out.println("해당 스택은 비어있습니다.");
                    }
                    else {
                        System.out.println("해당 스택은 비어있지 않습니다.");
                    }
                    break;

                case 8:                                 // 가득 찼는지
                    if(s.isFull()) {
                        System.out.println("해당 스택은 가득 찼습니다.");
                    }
                    else {
                        System.out.println("해당 스택은 가득 차지 않았습니다.");
                    }
                    break;
            }
        }
    }
}
