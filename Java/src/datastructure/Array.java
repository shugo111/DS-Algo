package datastructure;

public class Array {
    private int[] items;
    private int count;
    public Array(int length){
    items=new int[length];
    }
    public void insert(int data){
        if(items.length==count){
            int[] newItems= new int[count*2];
            for(int i=0;i<count;i++)
                newItems[i]=items[i];
            items=newItems;
        }

        items[count++]=data;
    }
    public void removeAt(int position){
        if(position>=count || position<0)
            throw new IllegalArgumentException();
        else{
            for(int i=position;i<count;i++){
                items[i]=items[i+1];
            }
            count--;
        }

    }
    public void indexOf(int data){
        int flag=-1;
        for(int i=0;i<count;i++){
            if(items[i]==data && flag==-1)
                flag=i;

        }
        System.out.println(flag);

    }
    public int max(){
         int max=items[0];
        for (int i=0;i<count;i++){
            if(items[i]>max)
                max=items[i];
        }
        return max;
    }
    public void intersect(int[] secondItem){
        for (int i:items) {
            for(int j:secondItem){
                if(i==j)
                    System.out.println(i);

            }

        }

    }
    public void reverse(){
        int i=0,j=count-1,temp;
        while(i<j){
            temp=items[i];
            items[i]=items[j];
            items[j]=temp;
            i++;j--;
        }

    }
    public void insertInto(int item,int index){
        int[] temp=new int[count+1];
        int i;
        for( i=0;i<index;i++){
            temp[i]=items[i];
        }
        temp[index]=item;
        for(int j=i+1;i<count;i++){
            temp[i+1]=items[i];
        }
        count++;
        items=temp;
    }
    public void print(){
        for (int i=0;i<count;i++)
            System.out.println(items[i]);
    }

}
