package code.collections.stack;

import java.util.Stack;

public class StackBracketsDemo {
    public static void main(String[] args) {
        String[] stringsForTask = {
                "(())",
                "()()(())",
                "((()))()(())",
                ")()()",
                "(()()(())",
                "((((()))))",
                ")))((("
        };

        for (String arrayElement : stringsForTask){
            System.out.println(arrayElement + " is correct? - " + isBracketCorrect(arrayElement));
        }

    }

    public static boolean isBracketCorrect(String stringLine){

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < stringLine.length(); i++) {
            char currentChar = stringLine.charAt(i);

            // если текущий элемент - открывающаяся скобка
            if (currentChar == '('){
                stack.push(currentChar);
            } else if (currentChar == ')'){
                // если наш стек - пустой, то это значит, что нет первоначальной открывающейся скобки
                if (stack.empty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

//        if (stack.empty()) {
//            return true;
//        } else {
//            return false;
//        }

        return stack.empty();

    }
}
