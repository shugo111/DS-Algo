package datastructure;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> item=new ArrayList<>();
        item.add(10);
        item.add(20);
        item.add(30);
        item.add(20);
        item.size();
        item.remove(0);
        item.indexOf(20);
        item.lastIndexOf(20);
        item.contains(30);
    }
}
