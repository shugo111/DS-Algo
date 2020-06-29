package placement;
import java.util.*;

public class IsUnique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int arr[]=new int[128];
        for(int c:s.toCharArray()){
            arr[c]++;
            if(arr[c]>1){
                System.out.print("Not unique characters");
                return;
            }
        }
        System.out.println("it has unique characters");

    }
}
