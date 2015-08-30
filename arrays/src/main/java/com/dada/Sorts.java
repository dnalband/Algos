package com.dada;

/**
 * Created by dnalband on 15/06/15.
 */
public class Sorts {

    static int arr[] = {2,4,1,3,6,5};

    private static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static  void bubbleSort (int[] a)
    {
        boolean swapped = true;
        for (int i = 0; i < a.length; i++) {
         swapped = false;

            for (int j = i+1; j < a.length ; j++) {

                if (a[i] > a[j])
                {
                  swap(a, i,j);
                    swapped = true;
                }
            }
            
        }

        for (int i = 0; i <  a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }

    private static void selectionSort(int[] arr)
    {
        int min = 0;

        for (int i = 0; i < arr.length-1; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                     if (arr[j] < arr[min])
                     {
                         min =j;
                     }
            }

           swap(arr, i, min);

        }

        for (int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    private static void insertionSort(int[] arr)
    {
       int j =2;
        int v =0;
        for (int i = 1; i < arr.length; i++) {
            v=arr[i];
            j=i;

            while (j>=1 && arr[j-1] > v)
            {
                arr[j] = arr[j-1];
                j--;

            }

            arr[j] =v;


        }
        for (int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }



    /* Function to merge the two haves arr[l..m] and arr[m+1..r] of array arr[] */
   static  void merge(int arr[], int l, int m, int r)
    {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 =  r - m;

    /* create temp arrays */
        int L[] = new int[n1];
        int R[] =  new int[n2];

    /* Copy data to temp arrays L[] and R[] */
        for(i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for(j = 0; j < n2; j++)
            R[j] = arr[m + 1+ j];

    /* Merge the temp arrays back into arr[l..r]*/
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

    /* Copy the remaining elements of L[], if there are any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

    /* Copy the remaining elements of R[], if there are any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /* l is for left index and r is right index of the sub-array
      of arr to be sorted */
    static void mergeSort(int arr[], int l, int r)
    {
        if (l < r)
        {
            int m = l+(r-l)/2; //Same as (l+r)/2, but avoids overflow for large l and h
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }


    /* UITLITY FUNCTIONS */
/* Function to print an array */
    static void  printArray(int A[])
    {

        for (int i=0; i < A.length; i++)
            System.out.println(A[i]);
    }


   static void merger(int[] a, int l, int m, int r)
    {
      int n1 = m-l+1;
      int n2 = r-m;

        int LArray [] = new int [n1];
        int RArray [] = new int [n2];


        for (int i=0;i<n1; i++)
        {
            LArray[i] = a[l+i];
        }
        for (int i=0;i<n2; i++)
        {
            RArray[i] = a[m+1+i];
        }

        int i=0, j=0, k=l;

        while (i< n1 && j < n2)
        {
            if(LArray[i]<= RArray[j])
            {
               a[k] = LArray[i];
                i++;
            }
            else
            {
                a[k] = RArray[j];
                j++;
            }
            k++;
        }


        while (i< n1)
        {
            a[k] = LArray[i];
            i++;k++;

        }
        while (j< n2)
        {
            a[k] = RArray[j];
            j++;k++;

        }
    }


   static void mergeSrt(int[] a, int l, int r)
    {

        if(l < r) {
            int m = (l + r) / 2;

            mergeSrt(a, l, m);
            mergeSrt(a, m + 1, r);
            merger(a, l, m, r);
        }


    }

    /* Driver program to test above functions */
    public static void  main(String [] args)
    {
        int arr[] = {12, 41, 13, 15, 37, 10};


        System.out.println("Given array is \n");
        printArray(arr);

        mergeSrt(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is \n");
        printArray(arr);

    }


   /* public static void main(String[] args) {
         //bubbleSort(arr);
       // selectionSort(arr);
        //insertionSort(arr);
    }*/
}
