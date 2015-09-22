package com.dada.array;

/**
 * Created by dnalband on 31/08/15.
 */
public class CheckPair {

   static int partition(int a[], int l , int r)
    {
          int p = a[r];

        int i = l -1 ;
        int temp = 0;
        for (int j =l; j < a.length-1; j++)
        {
              if(a[j] < a[r])
              {
                  i++;
                   temp = a[i];
                  a[i] = a[j];
                  a[j] = temp;
              }
        }

        temp = a[i+1];
        a[i+1] = a[r];
        a[r] = temp;
        return i+1;
    }

    static void qsort(int[] a, int l , int r)
    {
        if(l < r)
        {
            int p = partition(a, l, r);
            qsort(a, l , p-1);
            qsort(a, p+1, r);
        }
    }

    static int checkPairForSum(int[] a, int sum)
    {
        int l = 0;
        int r = a.length-1;

        while(l < r)
        {
            if(a[l]+a[r] == sum )
            {
                System.out.println("pair for sum "+ sum+ " are "+ a[l]+", "+a[r]);
               l++; r--;  // this is to find number of pairs
            }

            else if(a[l]+a[r] < sum)
            {
                l++;
            }
            else {
                r--;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int [] a = {12,2,4,10,6,8,9,54};

         qsort(a, 0, a.length-1);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        checkPairForSum(a, 14);

    }
}
