package placement;
import java.util.*;

public class URLify {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=sc.nextInt();
        char []arr=a.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[n-1]!=' ' && n>=0){
                arr[i]=arr[n-1];
                n--;
            }else{
                arr[i]='0';
                arr[--i]='2';
                arr[--i]='%';
                n--;
            }
        }
        System.out.print(arr);
    }
}
