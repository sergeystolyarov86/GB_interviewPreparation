package lesson2;


public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        System.out.println("List is empty-" + list.isEmpty());
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        list.delete(3);
        System.out.println(list);
        System.out.println("List is empty-" + list.isEmpty());
        list.add(0, 8);
        System.out.println(list);
        System.out.println("List contains 1-" + list.contains(1));
        System.out.println("\n");

        CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<>();
        System.out.println("customLinkedList-"+customLinkedList.size());
        customLinkedList.add(1);
        customLinkedList.add(2);
        customLinkedList.add(3);
        customLinkedList.add(4);
        customLinkedList.add(5);
        customLinkedList.add(6);
        System.out.println(customLinkedList);
        customLinkedList.delete(0);
        System.out.println("customLinkedList after delete size-" + customLinkedList.size());
        customLinkedList.add(4, 8);
        System.out.println(customLinkedList);
        System.out.println("customLinkedList contains 3-"+customLinkedList.contains(3));

    }
}
