package Stacks;
import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        String tempString = "(){}[]";
        boolean isValid = isValid(tempString);
        System.out.println("isValid: " + isValid);
    }

    public static boolean isValid(String tempString){
        Stack<Character> stack = new Stack<Character>();
        for(char character: tempString.toCharArray()){
            if(character == '(' || character == '{' || character == '[' ){
                stack.push(character);
            }
            else if(character == ')' || character == '}' || character == ']'){

                //Check if stack is empty
                if(stack.isEmpty()){
                    return false;
                }

                //Check Match
                char open = stack.pop();

                if(character == ')' && open != '('){
                    return false;
                }

                if(character == '}' && open != '{'){
                    return false;
                }

                if(character == ']' && open != '['){
                    return false;
                }
            }


        }

        return stack.isEmpty();
    }
}


