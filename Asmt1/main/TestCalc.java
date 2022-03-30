package main;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

import main.classes.PfCalculator;

public class TestCalc {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Post Fix Statement(with spaces): ");
            String input = sc.nextLine();
            // System.out.println("The entered Statement: " + input);

            StringTokenizer tokens = new StringTokenizer(input, " "); // tokenising the input

            if (tokens.countTokens() <= 2) {
                System.out.println("Invalid PostFix Expression");
                System.exit(0);
            }
            // should add tokens on to the queue
            Queue<String> tokenQueue = new LinkedList<>();
            while (tokens.hasMoreTokens()) {
                tokenQueue.add(tokens.nextToken()); // no exception required since we r considering no empty ST
                // System.out.println(tokenQueue);
            }

            // send the queue to the calc class
            System.out.println("The result of the Post-Fix Expression is: " + PfCalculator.evaluate(tokenQueue));

        } catch (EmptyStackException e) {
            System.out.println("Empty Stack Exception");
            System.exit(0);
        } catch (RuntimeException e) {
            System.out.println("Exception Handled: " + e);
            System.exit(0);
        }
    }
}
