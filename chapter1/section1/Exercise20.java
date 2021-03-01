package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise20 {
    static public double ln(int N) {
        if (N <= 0) return 0.0;
        return Math.log(N) + ln(N - 1);
    }

    public static void main(String[] args) {
        int N = 100;
        StdOut.println("ln(" + N + ") is " + ln(N));
    }
}
