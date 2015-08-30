package com.dada;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by dnalband on 31/05/15.
 */
public class Paranthesis {



    static boolean assertParanthesis(String str)
    {
        Stack<Character> stack = new Stack<Character>();
          char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if(chars[i]=='{'||chars[i]=='('||chars[i]=='[')
            {
                stack.push(chars[i]);
            }

            if(chars[i]=='}'||chars[i]==')'||chars[i]==']')
            {
               if(stack.isEmpty()) return false;

                Character character = stack.peek();
                if((chars[i]=='}' && character.equals('{') )||(chars[i]==')' && character.equals('('))||(chars[i]==']' && character.equals('[')))
                stack.pop();
            }

        }
        return stack.isEmpty()? true:false;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(assertParanthesis("[]"));
    }

}
