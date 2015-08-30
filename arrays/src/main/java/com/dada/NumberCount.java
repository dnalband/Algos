package com.dada;

/**
 * Created by dnalband on 28/08/15.
 */
public class NumberCount {


    static int firstIndex(int[] arr, int x)
    {
        int l = 0;
        int r = arr.length;
        int m =0;
        while(l<=r)
        {
            m = l+ (r-l)/2;

            if(m==0 && arr[m]==x)
            {
                return m;
            }
            if(arr[m]==x && (m!=0 && arr[m-1]!=x))
            {
              return m;
            }

            if(arr[m] >= x ) r = m-1;
            else l = m+1;
        }
        return -1;

    }


    static int lastIndex(int[] arr, int x)
    {
        int l = 0;
        int r = arr.length;
        int m =0;
        while(l<=r)
        {
            m = l+ (r-l)/2;

            if(m==arr.length-1 && arr[m]==x)
            {
                return m;
            }
            if(arr[m]==x && (m!=arr.length-1 && arr[m+1]!=x))
            {
                return m;
            }

            if(arr[m] <= x ) l = m+1;
            else r = m-1;
        }
        return -1;

    }

    public static void main(String[] args) {

        int [] arr = {1, 1, 2, 2, 2, 2, 3,};
        System.out.println(lastIndex(arr, 1)-firstIndex(arr,1)+1);

    }
}
