package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class Exercise14 {
    final static private int BASE = 2;
    static private int mProduct = 1;
    static private int mAnswer = 0;

    public static int lg(int N) {
        if (N < 0) {
            return Integer.MIN_VALUE;
        }

        int nextProduct;
        while ((nextProduct = mProduct * BASE) <= N) {
            mProduct = nextProduct;
            mAnswer++;
        }

        return mAnswer;
    }

    public static void main(String args[]) {
        Stopwatch timer = new Stopwatch();
        int one = 1;
        StdOut.println("The lg of " + one + " is " + lg(one));

        int two = 2;
        StdOut.println("The lg of " + two + " is " + lg(two));

        int three = 3;
        StdOut.println("The lg of " + three + " is " + lg(three));

        int four = 4;
        StdOut.println("The lg of " + four + " is " + lg(four));

        int seven = 7;
        StdOut.println("The lg of " + seven + " is " + lg(seven));

        int sixteen = 16;
        StdOut.println("The lg of " + sixteen + " is " + lg(sixteen));

        int n1024 = 1024;
        StdOut.println("The lg of " + n1024 + " is " + lg(n1024));
        double time = timer.elapsedTime();
        StdOut.printf("The time consuption is %.5f", time);
    }
}
