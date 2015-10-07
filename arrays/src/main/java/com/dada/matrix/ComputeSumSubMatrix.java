package com.dada.matrix;

/**
 * Created by dnalband on 05/10/15.
 */
public class ComputeSumSubMatrix {



    static void computeSum(int a[][], int k) {
        int row = a.length, col = a[0].length;
        for (int i = 0; i < row - k + 1; i++) {
            for (int j = 0; j < col - k + 1; j++) {
                int sum = 0;
                for (int l = i; l < k + i; l++) {
                    for (int m = j; m < k + j; m++) {
                        sum = sum + a[l][m];
                    }
                }
                System.out.println(sum);
            }
        }
    }


    public static void main(String[] args) {

        int a[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50},
        };

        computeSum(a,3);

    }
}