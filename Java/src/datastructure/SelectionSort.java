package datastructure;

public class SelectionSort {
    public void sort(int[] arr){

        for(int i=0;i<arr.length;i++){
            var temp=arr[i];
            int k=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<temp){
                    temp=arr[j];
                    k=j;
                }
            }
            arr[k]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
