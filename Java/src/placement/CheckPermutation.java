package placement;
import java.util.*;
public class CheckPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int []arr=new int[128];
        for(int c:a.toCharArray()){
            arr[c]++;
        }
        for(int c:b.toCharArray()){
            arr[c]--;
        }
        for(int i=0;i<128;i++){
            if(arr[i]!=0){
                System.out.print("the are not permutated");
                return;
            }
        }
        System.out.print("they are permutatted");
    }
}
