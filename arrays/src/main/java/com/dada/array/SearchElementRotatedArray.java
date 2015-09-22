package com.dada.array;

/**
 * Created by dnalband on 10/09/15.
 */
public class SearchElementRotatedArray {

    static int findPivot(int[] a)
    {
        int l = 0;
        int r = a.length;

        while(l< r)
        {
            int mid = l+(r-l)/2;

            if(a[mid] > a[mid+1])
            {
                return mid;
            }
            else if(a[l] >= a[mid])
            {
                r = mid-1;
            }
            else
            {
                l = mid+1;
            }
        }
        return -1;
    }

    static int binarySearch(int a[], int l, int r, int element)
    {

        while(l <= r)
        {
            int mid = l+ (r-l)/2;

            if (a[mid]==element)
                return mid;
            if (element <= a[mid])
            {
                r = mid -1;
            }
            else
            {
                l = mid+1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int a[] = {3,4,5,6,1,2};
        //int a[]= {5,6,1,2,3,4};
        int pivot = findPivot(a);
        int searchElement = 4;
        int elementAtIndex = -1;
        if (pivot > -1)
        {
              if (searchElement >=  a[0])
              {
                 elementAtIndex = binarySearch(a, 0,pivot, searchElement);
              }
              else
              {
                 elementAtIndex =  binarySearch(a, pivot+1, a.length, searchElement);
              }
        }

        System.out.println(elementAtIndex);
    }
}
