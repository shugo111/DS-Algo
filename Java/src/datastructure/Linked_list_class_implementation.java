package datastructure;

import java.util.Arrays;

public class Linked_list_class_implementation {
    public static void main(String[] args) {
        var list=new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(40);
        var demo=list.toArray();
        System.out.println(Arrays.toString(demo));
    }
}
