package datastructure;

public class BubbleSort {
    public void sort(int[] arr){
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    var temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
