package j04017;

import java.util.*;

public class Matrix {
    private int n, m;
    private int[][] a;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }
    
    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.a[i][j] = sc.nextInt();
            }
        }
    }
    
    public Matrix trans() {
        Matrix tmp = new Matrix(this.m, this.n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                tmp.a[i][j] = this.a[j][i];
            }
        }
        return tmp;
    }
    
    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(this.a[i][j] + " ");
            }
            System.out.println("");
        }
    }
        
    public Matrix mul(Matrix b) {
        Matrix res = new Matrix(this.n, b.m);
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < b.m; j++) {
                for (int k = 0; k < this.m; k++) {
                    res.a[i][j] += (this.a[i][k] * b.a[k][j]);
                }
            }
        }
        return res;
    }
    
    public String toString() {
        String res = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res += a[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }
}
