package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise22 {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }

        int mid = (lo + hi) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi);
        } else {
            return mid;
        }
    }

    public static int rank(int key, int[] a, int lo, int hi, int depth) {
        for (int i = 0; i < depth; i++) {
            StdOut.printf("\t");
        }
        StdOut.printf("lo: %d, hi: %d\n", lo, hi);
        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1, depth + 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, depth + 1);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int a[] = new int[]{2, 4, 6, 8, 10};
        rank(2, a);
    }
}
