package placement;


    import java.io.*;
    import java.util.*;


public class SherlockAndTheValidString {

    // Complete the isValid function below.
    static String isValid(String s) {
        int []arr=new int [26];
        int flag=0;
        int min=Integer.MAX_VALUE;
        for(int a:s.toCharArray()){
            arr[a-97]++;

        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0)
                min=Math.min(min,arr[i]);
        }

        for(int i=0;i<26;i++){
            if(arr[i]!=min){
                while(arr[i]!=min) {
                    if (flag == 0) {
                        flag = 1;
                        arr[i]--;
                    } else {
                        return "NO";
                    }
                }
            }
        }
        return "YES";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String s = scanner.nextLine();

        String result = isValid(s);

        System.out.print(result);

        scanner.close();
    }
}
