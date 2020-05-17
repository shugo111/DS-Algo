package datastructure;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
    }
    private boolean isEmpty(){
        return first==null;
    }
    private Node first;
    private Node last;
    private int size=0;

    public void addFirst(int data){
        var node =new Node(data);
        if (isEmpty()){
            last=first=node;
        }else{
            node.next=first;
            first=node;
        }
        size++;
    }
    public void addLast(int data){
        var node=new Node(data);
        if(isEmpty()){
            last=first=node;
        }else{
            last.next=node;
            last=node;
        }
        size++;
    }
    public int indexOf(int data){
        var temp=first;
        int count=0;
        while(temp!=null){
            if(temp.value==data){
                return count;
            }
            count++;
            temp=temp.next;
        }
        return -1;
    }
    public boolean contains(int data){
        return indexOf(data)!=-1;
    }
    public void removeLast(){
        if(first==null){
            throw new NoSuchElementException();
        }else{
            size--;
            if(first==last){
                first=last=null;
                return;
            }
            var temp=first;
            while(temp.next!=last){
                temp=temp.next;
            }
            temp.next=null;
            last=temp;

        }
    }
    public void removefirst(){
        if(first==null){
            throw new NoSuchElementException();
        }else{size--;
            if(first==last){
                first=last=null;
                return;
            }
            var temp=first.next;
            first.next=null;
            first=temp;
        }
    }
    public int size(){
        return size;
    }
    public int[] toArray(){
        int[] temp=new int[size];
        var current=first;
        int i=0;
        while(current!=null){
            temp[i++]=current.value;
            current=current.next;
        }
        return temp;
    }


}
