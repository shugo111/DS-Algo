package placement;
import java.util.*;
public class PalindromePermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int arr[]=new int[128];
        int flag=0;
        int j=' ';
        for(int i:a.toCharArray()){
            if(i!=j)
                arr[i]++;
        }
        for(int i=0;i<128;i++){
            if(arr[i]%2!=0){
                if(flag!=1){
                    flag=1;
                }else{
                    System.out.print("False");
                    return;
                }

            }
        }
        System.out.println("true");
    }
}
