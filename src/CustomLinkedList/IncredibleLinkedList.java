package CustomLinkedList;

import java.util.Arrays;

public class IncredibleLinkedList {


    private LinkedItem currentItem;

    void add(int value) {
        currentItem = new LinkedItem(currentItem, value);
    }

    int get(int index) {
        int value = 0;
        LinkedItem item = currentItem;

        for (int i = 0; i < size() - index; i++) {
            value = item.value;
            item = item.nextItem;
        }
        return value;
    }

    void replace (int index, int value) {
        LinkedItem item = currentItem;
        for (int i = 0; i < size() - 1 - index; i++) {
            item = item.nextItem;
        }
        item.value = value;
    }

    int size() {
        int counter = 0;
        LinkedItem item = currentItem;
        while (item != null) {
            counter++;
            item = item.nextItem;
        }
        return counter;
    }

    void sort() {
        int[] arr = new int[size()];
        LinkedItem sortedItem = null;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = currentItem.value;
            currentItem = currentItem.nextItem;
        }
        Arrays.sort(arr);
        for (int sortedArr : arr) {
            sortedItem = new LinkedItem(sortedItem, sortedArr);
        }
        currentItem = sortedItem;
    }
    void sort2(){


    }

    void invert() {
        LinkedItem invertedItem = null;
        int size = size();
        for (int i = 0; i < size; i++) {
            invertedItem = new LinkedItem(invertedItem, currentItem.value);
            currentItem = currentItem.nextItem;
        }
        currentItem = invertedItem;
    }

    void clear(int index) {
        LinkedItem itemBefore = currentItem;
        for (int i = 0; i < size() - 2 - index; i++) {
            itemBefore = itemBefore.nextItem;
        }
        LinkedItem itemAfter = itemBefore;
        for (int i = 0; i < 2; i++) {
            itemAfter = itemAfter.nextItem;
        }
        itemBefore.nextItem = itemAfter;
    }

    @Override
    public String toString() {
        String s = "";
        LinkedItem item = currentItem;
        while (item != null) {
            s = item.value + " " + s;
            item = item.nextItem;
        }
        return s;
    }
}
