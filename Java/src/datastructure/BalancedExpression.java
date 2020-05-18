package datastructure;

import java.util.Stack;

public class BalancedExpression {
    public boolean balance(String input){
        Stack<Character> a=new Stack<>();

        for(char ch:input.toCharArray()){
            if(ch=='('||ch=='['||ch=='<'||ch=='{')
                a.push(ch);
            else if((
                    (ch==')' && a.peek()=='(')||
                            (ch==']'&& a.peek()=='[')||
                            (ch=='>'&& a.peek()=='<')||
                            (ch=='}'&& a.peek()=='{')
            )) {
                if(a.empty()){
                    return false;
                }
                a.pop();
                continue;
            }
        }
        return a.empty();
    }

    public static void main(String[] args) {
        String src="({1+<[2]>)";
        BalancedExpression a=new BalancedExpression();
        var b=a.balance(src);
        System.out.println(b);
    }
}
