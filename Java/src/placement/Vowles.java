package placement;

//For example, consider the list of strings strArr = ['aba','bcb','ece','aa','ee']. There are multiple queries against the list of string given as queries = ['1-3','2-5','2-2']. These strings represent two dashes delimited integers r and l, the start and end indices of the interval. Using 1-based indexing in the string array, the interval 1-3 contains two strings that start and end with a vowel: 'aba'and 'ece' The interval 2-5 also has three. The third interval, from 2-2, the only element in the interval, 'bcb' does not begin and end with a vowel. The
//return array for the queries is [2,3,0].
//
//Given a string array that contains n elements, each composed of lowercase English letters, and q queries, each of the format l-r, for each, determine how many strings starting from index l and ending at index r have vowels as the first and last character.
//
//Function Description
//
//Complete the hasVowels function in the editor below. It must return an array of integers that represents the result of each query in the order given.
//
//hasVowel has the following parameters.
//strArr: an array of n strings to test at indices [1-n]
//query: an array of q string, each of which describes an interval l-r using integers delimited by a dash
//
//Constraints 1 sn, q 105 1 s rs n 1 size of strArr[i] < 10
import java.io.*;
import java.util.*;



public class Vowles {


    static List<Integer> hasVowels(List<String> strArr, List<String> query) {
        List<Integer> temp = new ArrayList<>();
        int k=0;
        for(var i:query){
            int a=Integer.parseInt(i.substring(0,1));
            int b=Integer.parseInt(i.substring(2,3));
            int count=0;
            for(int j=a-1;j<b;j++){
                int n=strArr.get(j).length();
                char cha=strArr.get(j).charAt(0);
                char chb=strArr.get(j).charAt(n-1);
                if((cha=='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u')&&(chb=='a'||chb=='e'||chb=='i'||chb=='o'||chb=='u')){
                    count+=1;
                }
            }
            temp.add(k,count);
            k++;
        }
        return temp;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        //strArr = ['aba','bcb','ece','aa','ee'],queries = ['1-3','2-5','2-2']
        System.out.print("Enter number of values:");
        int strArrCount = sc.nextInt();

        List<String> strArr = new ArrayList<>();

        for (int i = 0; i < strArrCount; i++) {
            System.out.print(i);
            String strArrItem = sc.next();
            strArr.add(strArrItem);
        }
        System.out.print("Enter number of queries:");
        int queryCount = sc.nextInt();
        List<String> query = new ArrayList<>();

        for (int i = 0; i < queryCount; i++) {
            System.out.print(i);
            String queryItem = sc.next();
            query.add(queryItem);

        }

        List<Integer> res = hasVowels(strArr, query);
        System.out.print(res);

    }

}