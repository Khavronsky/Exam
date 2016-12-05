package CustomLinkedList;

public class IncredibleLinkedList {


    private LinkedItem currentItem;

    void add(int value) {
        currentItem = new LinkedItem(currentItem, value);
    }

    void invert(){
//TODO инвертировать список
    }

    void clear(int index){

    }

    void sort(){

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

    int size() {
        int counter = 0;
        LinkedItem item = currentItem;
        while (item != null){
            counter++;
            item = item.nextItem;
        }
        return counter;
    }

    @Override
    public String toString() {
        String s = "";
        LinkedItem item = currentItem;
        while (item != null){
            s = item.value + " " + s;
            item = item.nextItem;
        }
        return s;
    }
}
