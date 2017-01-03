import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

/*----------------------------------------------------------------
 *  Author:        Nikolai Smotritski
 *  Written:       25/12/2016
 *  Last updated:  27/12/2016
 *
 *  Compilation:   javac Percolation.java
 *  Execution:     java Percolation
 *  
 *  Assesses the percolation threshold using Monte-Carlo method.
 *----------------------------------------------------------------*/
public class Percolation {

    private int[] parent;   // parent[i] = parent of i
    private int[] size;     // size[i] = number of sites in subtree rooted at i
    private int count;      // number of components
    public int[][] percolation; // percolation Matrix

    public Percolation(int n) {
        percolation = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                percolation[i][j] = 0;//xyTo1D(i,j,n);
            }
        }
        WeightedQuickUnionUF weightedQuickUnionUF = new WeightedQuickUnionUF(n*n);
    }// create n-by-n grid, with all sites blocked
    public void open(int row, int col) {

    }// open site (row, col) if it is not open already
    public boolean isOpen(int row, int col){
        return true;
    }// is site (row, col) open?
    public boolean isFull(int row, int col) {
        boolean result = false;
        return result;
    }// is site (row, col) full?
    public boolean percolates() {
        boolean result = false;
        return result;
    }// does the system percolate?

    private static int generateRandom (int n) {
        return 0;
    }

    private static int xyTo1D(int row,int col, int n) {
        return row*n + col;
    }

    private static boolean validateIndices (int row,int col) {
        return true;
    }

    public void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(percolation[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        Percolation p = new Percolation(n);
        p.print(n);

    }
}

// if (i <= 0 || i > n) throw new IndexOutOfBoundsException("row index i out of bounds");