package com.dada;

/**
 * Created by dnalband on 15/06/15.
 */
public class BinarySearch {

    static  int [] array = {2,4,5,6,7,8,9};

   static int search (int[] array, int item)
    {
        int left = 0;
        int right = array.length-1;

        int mid = (left+right)/2;


        while (left < right)
        {
            mid = (left+right)/2;
            if (item==array[mid])
            {
                return  mid;
            }
            if (item > array[mid])
            {
                left = mid+1;
            }
            else {
                right = mid;
            }


        }

        System.out.println("item not found");
     return -1;

    }

    static int binarySearchRecursion(int[] arr, int left, int right, int data)
    {
          if(arr == null) return -1 ;
          if (left <=  right)
          {
               int mid = left + (right-left)/2;

              if(array[mid] == data)
                  return mid;
              if (array[mid] > data )
                  right = mid-1;
              if (array[mid] < data)
                  left = mid+1;
              return binarySearchRecursion(arr,left,right, data);
          }
        return -1;



    }




    public static void main(String[] args) {
        System.out.println(binarySearchRecursion(array,0,array.length-1, 5));


    }

}
