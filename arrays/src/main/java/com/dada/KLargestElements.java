package com.dada;

/**
 * Created by dnalband on 26/08/15.
 */
public class KLargestElements {



    static int getMinIndex(int[] temp)
    {
        int min = Integer.MAX_VALUE;

        int minindex = -1;
        for (int i = 0; i < temp.length ; i++) {

            if (min > temp[i]) {
                min = temp[i];
                minindex = i;
            }
        }

        return minindex;
    }
    public static void main(String[] args) {

        int[] actualArray = {23,5,6,1,7,8,9,12};
        int k = 3;

        int[] temp = new int[k];


        int min = Integer.MAX_VALUE;
        for (int i = 0; i < k ; i++) {
            temp[i] = actualArray[i];
        }

        int minindex = getMinIndex(temp);

        for (int i = k-1; i < actualArray.length; i++) {

            if (actualArray[i] > temp[minindex])
            {
                temp[minindex] = actualArray[i];

                minindex = getMinIndex(temp);
            }

        }

        for (int i = 0; i < k; i++) {
            System.out.println(temp[i]);
        }




    }

}
