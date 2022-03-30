package main.classes;

import java.util.Queue;
import java.util.Stack;

public class PfCalculator {
    // use a stack to evaluate the statement
    public static double evaluate(Queue<String> tokenQueue) {
        double result = 0;
        Stack<Double> operands = new Stack<Double>();

        while (!tokenQueue.isEmpty()) {
            try {
                String token = tokenQueue.poll();
                switch (token) {
                    case "+":
                    case "-":
                    case "/":
                    case "*":
                    case "%":
                    case "^":
                        double right = operands.pop();
                        double left = operands.pop();
                        switch (token) {
                            case "+":
                                result = left + right;
                                break;
                            case "-":
                                result = left - right;
                                break;
                            case "*":
                                result = left * right;
                                break;
                            case "/":
                                try {
                                    if (right == 0) {
                                        throw new ArithmeticException();
                                    } else {
                                        result = left / right;
                                    }
                                } catch (ArithmeticException e) {
                                    System.out.println("Division by zero error!!");
                                    System.exit(0);
                                }
                                break;
                            case "%":
                                try {
                                    if (right == 0) {
                                        throw new ArithmeticException();
                                    } else {
                                        result = left % right;
                                    }
                                } catch (ArithmeticException e) {
                                    System.out.println("Modulus by zero error!!");
                                    System.exit(0);
                                }
                                break;
                            case "^":
                                try {
                                    if (right == 0 && left == 0) {
                                        throw new ArithmeticException();
                                    } else {
                                        result = Math.pow(left, right);
                                    }
                                } catch (ArithmeticException e) {
                                    System.out.println("Power of zero by zero is undefined!");
                                    System.exit(0);
                                }
                                break;
                            default:
                                break;
                        }
                        // System.out.println(result);
                        operands.push(result);
                        break;
                    default:
                        operands.push(Double.parseDouble(token));
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Operand in the Expression!!");
                System.exit(0);
            }
        }
        result = operands.pop();
        if (operands.isEmpty()) {
            return result;
        } else {
            System.out.println("Invalid PostFix Expression");
            System.exit(0);
        }
        return result;
    }
}