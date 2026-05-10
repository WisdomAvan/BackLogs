package Memory;

import java.util.EmptyStackException;

public class Stack {
    private int size;


    private int[] element = new int[3];

    public boolean isStackEmpty() {
        return size == 0;
    }

    public int push(int item) {
        element[size] = item;
        size++;
        return item;
    }

    public int pop() {
        if (isStackEmpty()) throw new EmptyStackException();
        size--;
        return element[size];

    }

    public int peek() {
        if (isStackEmpty()) throw new EmptyStackException();
        return element[size - 1];
    }

    public int getSize() {
        return size;
    }

    public boolean empty() {
        if (isStackEmpty()) {
            return true;
        }
        return false;
    }

    public int search(int item) {
        int index = 0;
        int position = 1;
        for (index = size-1; index >=0; index--) {
            if (element[index] == item) {
                return position;
            }
            position++;
        }
        return -1;
    }
}

