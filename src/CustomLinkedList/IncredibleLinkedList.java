package CustomLinkedList;

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

    void sort(){
        int tmp;
        for (int i = size() - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {

                if (get(j) > get(j+1)){
                    tmp = get(j);
                    replace(j, get(j+1));
                    replace(j+1, tmp);
                }
            }
        }
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
