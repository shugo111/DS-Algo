package datastructure;

public class InsertionSort {
    public void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            var temp=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j]=temp;

        }
    }
}
