package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Vector;

public class Exercise19 {
    static public class Fiboncci {
        public static long F(int N) {
            if (N <= 0) return 0;
            if (N == 1) return 1;
            return F(N - 1) + F(N - 2);
        }
    }

    static public class FibonacciWithMemo {
        static private Vector<Long> mMemo = new Vector<>();

        public static long F(int N) {
            if (mMemo.size() < N + 1) {
                mMemo.add(N, 0L);
            }

            if (N <= 0) return 0;
            if (N == 1) return 1;

            if (mMemo.get(N) == 0) {
                mMemo.add(N, F(N - 1) + F(N - 2));
            }

            return mMemo.get(N);
        }
    }

    public static void main(String[] args) {
        int count = 40;
        Stopwatch fibonacciWithMemoTimer = new Stopwatch();
        FibonacciWithMemo fibonacciWithMemo = new FibonacciWithMemo();
        for (int N = 0; N < count; N++) {
            StdOut.println(N + " " + fibonacciWithMemo.F(N));
        }
        StdOut.println("Time of fibonacci(" + count + "), is "
                + fibonacciWithMemoTimer.elapsedTime());

        Stopwatch fibonacciTimer = new Stopwatch();
        Fiboncci fiboncci = new Fiboncci();
        for (int N = 0; N < count; N++) {
            StdOut.println(N + " " + fiboncci.F(N));
        }
        StdOut.println("Time of fibonacci(" + count + "), is "
                + fibonacciTimer.elapsedTime());
    }
}
