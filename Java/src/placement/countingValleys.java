package placement;
//Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. During his last hike he took exactly  steps. For every step he took, he noted if it was an uphill, , or a downhill,  step. Gary's hikes start and end at sea level and each step up or down represents a  unit change in altitude. We define the following terms:
//
//A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
//A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
//Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.
//
//For example, if Gary's path is , he first enters a valley  units deep. Then he climbs out an up onto a mountain  units high. Finally, he returns to sea level and ends his hike.
//
//Function Description
//
//Complete the countingValleys function in the editor below. It must return an integer that denotes the number of valleys Gary traversed.
//
//countingValleys has the following parameter(s):
//
//n: the number of steps Gary takes
//s: a string describing his path
//Input Format
//
//The first line contains an integer , the number of steps in Gary's hike.
//The second line contains a single string , of  characters that describe his path.
//
//Constraints
//
//Output Format
//
//Print a single integer that denotes the number of valleys Gary walked through during his hike.
//
//Sample Input
//
//8
//UDDDUDUU
//Sample Output
//
//1
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class countingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int count=0;
        int v=0;
        int flag=0;
        for(char a:s.toCharArray()){
            if(a=='D')
                count--;
            else
                count++;
            if(flag==0&&count<0){
                v++;
                flag=1;
            }
            if(count>=0&&flag==1){
                flag=0;
            }
        }
        return v;
    }



    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int result = countingValleys(n, s);
        System.out.print(result);


        sc.close();
    }
}
