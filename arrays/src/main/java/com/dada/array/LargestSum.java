package com.dada.array;

/**
 * Created by dnalband on 08/09/15.
 *
 * very good problem, just check for start index and last index for finding max sub array
 */
public class LargestSum {

   static int max(int x, int y)
   {
       return x > y ? x : y;
   }
    static int[] largestSum(int [] array)
    {

        int current_sum = 0;
        int sum_so_far = 0;
        int [] largestSum = new int[3];
        int tempStartIndex =0;

        for (int i = 0; i < array.length; i++) {

            current_sum = current_sum+array[i];
            if (current_sum < 0)
            {
                current_sum =0;
                tempStartIndex = i+1;

            }
            if (current_sum > sum_so_far)
            {
                sum_so_far = current_sum;
                largestSum[0] = tempStartIndex;
                largestSum[1] = i;
                largestSum[2] = sum_so_far;
            }
        }
        return largestSum;
    }

    public static void main(String[] args) {
        int [] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(largestSum(array)[1]);
    }
}
