package datastructure;

public class PriorityQueue {
    private int[] array=new int[10];
    private int count=-1;
    public void insert(int data){
        if(count==-1){
            array[++count]=data;
        }else{
            int temp=count;
            count++;
            while(data<array[temp]){
               array[temp+1]=array[temp];
               temp--;
               if(temp==-1){
                   break;
               }
            }
            array[temp+1]=data;
        }
    }

    public int remove(){
        int temp=array[0];
        int index=0;
        while(index!=count){
            array[index]=array[index+1];
            index++;
        }
        return temp;
    }
}
