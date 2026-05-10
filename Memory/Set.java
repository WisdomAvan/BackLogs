package Memory;

import java.util.ArrayList;
import java.util.List;

public class Set {

    private List<Integer> myList;

    public Set() {
        myList = new ArrayList<>();
    }

    public int size() {
        return myList.size();
    }

    public boolean isEmpty() {
        return myList.isEmpty();
    }

    public boolean contains(int element) {
        for (int value : myList) {
            if (value == element) {
                return true;
            }
        }
        return false;
    }

    public void add(int element) {
        if (!contains(element)) {
            myList.add(element);
        }
    }

    public void remove(int element) {
        if (contains(element)) {
            myList.remove(Integer.valueOf(element));
        } else {
            throw new IllegalArgumentException("Element not found");
        }
    }

    public int union(Set anotherSet) {
        List<Integer> newList = new ArrayList<>(myList);

        for (int value : anotherSet.myList) {
            if (!newList.contains(value)) {
                newList.add(value);
            }
        }

        return newList.size();
    }

    public int intersection(Set anotherSet) {
        List<Integer> newList = new ArrayList<>();

        for (int value : anotherSet.myList) {
            if (contains(value)) {
                newList.add(value);
            }
        }

        return newList.size();
    }
}