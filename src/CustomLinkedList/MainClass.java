package CustomLinkedList;

class MainClass {

    public static void main(String[] args) {

        IncredibleLinkedList list = new IncredibleLinkedList();
        int[] addArray = {0, 5, 1, 6, 2, 7, 3, 8, 4, 9};
        int getIndex = 3;
        int clearIndex = 4;
        int replaceIndex = 2;
        int replaceValue = 8;

        addMethodTest(list, addArray);
        getMethodTest(list, getIndex);
        sortMethodTest(list);
        invertMethodTest(list);
        clearMethodTest(list, clearIndex);
        sizeMethodTest(list);
        replaceMethodTest(list, replaceIndex, replaceValue);
    }

    private static void replaceMethodTest(IncredibleLinkedList list, int replaceIndex, int replaceValue) {
        System.out.println("Replace " + replaceIndex + " element");
        System.out.println("list before replace " + list);
        list.replace(replaceIndex, replaceValue);
        System.out.println("list after replace " + list);
        System.out.println("_____\n");
    }

    private static void addMethodTest(IncredibleLinkedList list, int[] addArray) {
        System.out.println("Method add working: added " + addArray.length + " elements");
        for (int array : addArray) {
            list.add(array);
        }
        System.out.println("List: " + list);
        System.out.println("_____\n");
    }

    private static void getMethodTest(IncredibleLinkedList list, int getIndex) {
        System.out.println("Method get(getIndex " + getIndex + ") return: " + list.get(getIndex));
        System.out.println("_____\n");
    }

    private static void sizeMethodTest(IncredibleLinkedList list) {
        System.out.println("list size: " + list.size());
        System.out.println("_____\n");
    }

    private static void sortMethodTest(IncredibleLinkedList list) {
        list.sort();
        System.out.println("Sorted list: " + list);
        System.out.println("_____\n");
    }

    private static void invertMethodTest(IncredibleLinkedList list) {
        list.invert();
        System.out.println("Inverted list: " + list);
        System.out.println("_____\n");
    }

    private static void clearMethodTest(IncredibleLinkedList list, int clearIndex) {
        list.clear(clearIndex);
        System.out.println("Clear " + clearIndex + " element.");
        System.out.println("list after clear element: " + list);
        System.out.println("_____\n");
    }
}
