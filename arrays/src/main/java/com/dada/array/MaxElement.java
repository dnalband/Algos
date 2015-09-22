package com.dada.array;

/**
 * Created by dnalband on 12/05/15.
 */
public class MaxElement {


    public static void main(String[] args) {

        long a[] = new long[10];

        for (int i = 0; i < 10; i++) {


            a[i] = (i+10*i)/(i+5);
            System.out.println(a[i]);
        }

        long currMax = a[0];

        for (int i = 0; i < a.length; i++) {

            if(currMax < a[i])
            {
                currMax = a[i];
            }
        }

        System.out.println("cur max "+currMax);


    }

}
