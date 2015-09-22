package com.dada.array;

import java.sql.SQLException;

/**
 * Created by dnalband on 20/09/15.
 */
public class FlipElements {
    static  int a[] ={1,3,5,6,7,87,89,90,92,97};


    static void rightRotate()
    {

        int temp = a[a.length-1];
        int k =0;
        for (int i = a.length-1; i > 0; i--) {

            a[i] = a[i-1];
        }
        a[0] = temp;
    }

    static void rotateLeft(int d)
    {
        if(d==0)
        {

            return;
        }

        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i-1] = a[i];
        }
        a[a.length-1] = temp;

        rotateLeft(d-1);
    }

    static void printArray()
    {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }

    public static void main(String[] args) {
            rotateLeft(2);
            printArray();

    }

}
