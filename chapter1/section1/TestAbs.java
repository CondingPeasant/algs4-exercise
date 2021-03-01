package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class TestAbs {
    public static void main(String[] args) {
        int minInt = -2147483648;
        StdOut.printf("The abs of %d is %d\n", minInt, Math.abs(minInt));
    }
}
