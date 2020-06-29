package placement;
import java.util.*;
public class OneAway {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int[] arr=new int[128];
        int count=0;
        int j=0;
        for(int c:a.toCharArray()){
            arr[c]++;
        }
        for(int c:b.toCharArray()){
            arr[c]--;
        }
        for(int i=0;i<128;i++){
            if(arr[i]==-1 || arr[i]==1){
                count++;
            }
            if(arr[i]==1){
                j++;
            }
        }
        if(count==1||count==2){
            System.out.println("true");
            return;
        }
        System.out.println("false");
    }
}
