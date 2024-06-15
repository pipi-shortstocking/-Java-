package Ch4.prac;

public class Stack<E> {
    private E [] stk;
    private int capacity;
    private int ptr;

    // 실행 시 예외
    // 스택이 비어 있음
    public static class EmptyStackException extends RuntimeException {
        public EmptyStackException() {}
    }

    // 스택이 가득 참
    public static class OverflowStackException extends RuntimeException {
        public OverflowStackException() {}
    }

    // 생성자
    public Stack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = (E []) new Object[capacity]; // 스택 본체용 배열 생성
        } catch (OutOfMemoryError e) { // 생성할 수 없음
            capacity = 0;
        }
    }

    public E push(E x) throws OverflowStackException {
        if (ptr >= capacity)
            throw new OverflowStackException();

        return stk[ptr++] = x;
    }

    public E pop() throws EmptyStackException {
        if (ptr <= 0)
            throw new EmptyStackException();

        return stk[--ptr];
    }

    public E peak() throws EmptyStackException {
        if (ptr <= 0)
            throw new EmptyStackException();

        return stk[ptr-1];
    }

    public void clear() {
        ptr = 0;
    }

    public int indexOf(E x) {
        for(int i = ptr-1; i >= 0; i--){ // 최상단에서 선형 검색
            if (stk[i] == x)
                return i; // 검색 성공
        }
        return -1; // 검색 실패
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return ptr;
    }

    public boolean isEmpty() {
        return ptr <= 0;
    }

    public boolean isFull() {
        return ptr >= capacity;
    }

    public void dump() {
        if (ptr <= 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for(int i = 0; i < ptr; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }
}
