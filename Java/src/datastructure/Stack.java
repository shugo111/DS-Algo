package datastructure;

public class Stack {
    private int[] item=new int[5];
    int top=-1;
    public void push(int data){
        if(top>4)throw new IndexOutOfBoundsException();
        item[++top]=data;
    }
    public int pop(){
        if(top<0)throw new IndexOutOfBoundsException();
        int temp=item[top];
        top--;
        return temp;
    }
    public int peek(){
        return item[top];
    }
    public boolean isEmpty(){
        if(top<0)return true;
        return false;
    }
}
