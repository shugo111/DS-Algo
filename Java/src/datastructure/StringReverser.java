package datastructure;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input){
        if(input==null)
            throw new IllegalArgumentException();
        Stack<Character> a=new Stack<>();
        for(char ch:input.toCharArray()){
            a.push(ch);
        }
        StringBuffer b=new StringBuffer();
        while(!a.empty()){
            b.append(a.pop());
        }
        return b.toString();
    }
}
