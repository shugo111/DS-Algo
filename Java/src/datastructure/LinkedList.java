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
    public void reverse(){
        if(first==last)return;
        var temp1=first;
        var temp2=temp1.next;


        first=last;
        last=temp1;

        temp1.next=null;
        while(temp2!=null){
            var temp3=temp2.next;
            temp2.next=temp1;
            temp1=temp2;
            temp2=temp3;

        }
        //temp2.next=temp1;
    }
    public int getkthelement(int k){
        if(k<=0)throw new IllegalArgumentException();
        var temp1=first;
        var temp2=first;
        var count=0;
        while(temp2.next!=null){
            if(count<k-1){
                temp2=temp2.next;
                count++;
            }else{
                temp2=temp2.next;
                temp1=temp1.next;
                count++;
            }
        }
        return temp1.value;
    }
    public void printMiddle(){
        var a=first;
        var b=first;
        while(b.next!=null){
            if(b.next.next==null){
                System.out.println(a.value);
                a=a.next;
                b=b.next;
                System.out.println(a.value);
                return;
            }else{
                a=a.next;
                b=b.next.next;
            }
        }
        System.out.println(a.value);
        return;
    }
    public boolean hasLoop(){
        var a=first;
        var b=first;
        while(b.next!=null){
            a=a.next;
            b=b.next.next;
            if(a==b){
                return true;
            }
        }
        return false;
    }


}
