package datastructure;


import java.io.*;
import java.util.*;



public class Main {


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