package datastructure;

public class Array_class_implementation {
    public static void main(String[] args) {
        Array hello=new Array(3);
        hello.insert(20);
        hello.insert(30);
        hello.insert(40);
        hello.insert(10);
        hello.insert(60);
        hello.insertInto(200,2);
        hello.print();
    }
}
