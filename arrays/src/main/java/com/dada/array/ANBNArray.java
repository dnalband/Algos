package com.dada.array;

/**
 * Created by dnalband on 12/10/15.
 */
public class ANBNArray {


    public  static void a1b1(int a[])
    {
        for (int i = 0; i <a.length/2 ; i++) {
            int a1 = a[i];
            int b1 = a[i+a.length/2];

        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,10,20,30,40,50};

        int j = -1;
        for (int i = a.length/2; i < a.length-1; i++) {
            int key = a[i];
            for (int k = i-1; k >j; k--) {
                a[k+1] = a[k];
            }
            j= j+2;
            if (j < i )
            {
                a[j] = key;
            }
        }

        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        }




}
