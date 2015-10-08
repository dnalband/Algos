package com.dada.array;

/**
 * Created by dnalband on 07/10/15.
 */
public class FindSubArraySumGTX {

    static int findSum(int[] a, int val)
    {
       int sum =0;
        int minlen = a.length;
        for (int i = 0; i < a.length ; i++) {

            if (a[i] > val)
            {
                System.out.println( "index is "+i);
                return 1;
            }
            sum = a[i];

            for (int j = i+1; j <a.length ; j++) {
                sum = sum+a[j];

                if (sum > val && j-i+1 < minlen)
                {
                    minlen = j-i+1;
                    System.out.println("index i "+i+" index j "+j);
                }
            }
        }
        return minlen;
    }

    public static void main(String[] args) {
        int a[] = {2,17,6,14,8,9,10};
        System.out.println(findSum(a, 20));
    }
}
