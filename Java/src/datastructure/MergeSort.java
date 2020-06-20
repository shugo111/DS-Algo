package datastructure;

public class MergeSort {

    public void sort(int []arr){
        if(arr.length<2)
            return;
        var middle=arr.length/2;
        int [] left=new int[middle];
        for(var i=0;i<middle;i++){
            left[i]=arr[i];
        }
        int [] right=new int[arr.length-middle];
        for(var i=middle;i<arr.length;i++){
            right[i-middle]=arr[i];
        }
        sort(left);
        sort(right);
        merge(left,right,arr);

    }
    private void merge(int []left,int[] right,int[] arr){
        int i=0,j=0,k=0;
        while(i<left.length&&j<right.length){
            if(left[i]<right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        while(i<left.length)
            arr[k++]=left[i++];
        while(j<right.length)
            arr[k++]=right[j++];
    }
}
