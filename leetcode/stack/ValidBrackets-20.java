package leetcode.stack;

import java.util.Stack;

class ValidBrackets {
    public boolean isValid(String s) {
        if (s.length() == 0)
            return true;
        Stack<String> stack = new Stack<>();
        String[] source = s.split("");
        stack.push(source[0]);
        for (int i = 1; i < source.length; i++) {
            System.out.println(stack.toString());
            if (!stack.isEmpty()) {
                String peek = stack.peek();
                System.out.println(peek + " " + source[i]);
                if ((peek.equals("(") && source[i].equals(")")) || (peek.equals("[") && source[i].equals("]"))
                        || (peek.equals("{") && source[i].equals("}"))) {
                    stack.pop();
                } else {
                    stack.push(source[i]);
                }
            } else {
                stack.push(source[i]);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new ValidBrackets().isValid("{[](){[]}}"));
    }
}