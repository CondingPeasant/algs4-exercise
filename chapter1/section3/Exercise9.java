package chapter1.section3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Exercise9 {
    private static Stack<String> expression = new Stack<>();
    private static Stack<String> operator = new Stack<>();

    private static String addLeftParenthesis(String in) {
        String[] inputValues = in.split("\\s");
        for (String s : inputValues) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                operator.push(s);
            } else if (s.equals(")")) {
                String rightHandExp = expression.pop();
                String leftHandExp = expression.pop();
                expression.push("( " + leftHandExp + " " + operator.pop() + " "
                        + rightHandExp + " )");
            } else {
                expression.push(s);
            }
        }
        return expression.isEmpty() ? " " : expression.pop();
    }

    public static void main(String[] args) {
        String test = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        StdOut.println(addLeftParenthesis(test));
    }
}
