package com.dada.matrix;

/**
 * Created by dnalband on 22/09/15.
 */
public class FindInSortedMatrix {

    static void search(int a[][], int element)
    {
            int i =0, j = a.length-1;

            while (i < a.length && j >=0)
            {
                if (a[i][j] == element)
                {
                    System.out.println("Found the element "+ element);
                    return;
                }
                if (element < a[i][j] )
                {
                    j--;
                }
                else
                {
                    i++;
                }
            }
    }

    static void  printZigZag(int a[][])
    {

        int top=0, right = a[0].length-1, bottom = a.length-1;
       while (top < bottom)
       {
           for (int i = 0; i <=right; i++) {
               System.out.println(a[top][i]);
           }
           top++;
           for (int i = right; i >=0; i--) {
               System.out.println(a[top][i]);
           }
           top++;
       }
    }


    static void spiral (int a[][])
    {
        int top =0, left = 0, bottom= a.length-1, right = a[0].length-1;

        while (top < bottom && left < right)
        {
            for (int i = left; i <=right; i++) {
                System.out.println(a[top][i]);
            }
            top++;

            for (int i = top; i <=bottom ; i++) {
                System.out.println(a[i][right]);
            }
            right--;

            for (int i = right; i >=left ; i--) {
                System.out.println(a[bottom][i]);
            }
            bottom--;

            for (int i=bottom; i>=top; i--)
            {
                System.out.println(a[i][left]);
            }
            left++;
        }
    }

    static void diagonalPrint(int a[][])
    {

       int top=0,left =0, right = a[0].length, bottom = a.length-1;

        while (left <=right &&  bottom>=top)
        {
            for (int i = top; i <=bottom; i++) {
                System.out.println(a[i][left]);
            }
            for (int i = left+1; i < right ; i++) {
                System.out.println(a[bottom][i]);
            }
            left++;
            bottom--;
        }
    }

    static void rectangleXO(int x, int y)
    {
        char [][] a = new char[x][y];

        int top =0, left =0, right=y-1, bottom=x-1;

       boolean flag= false;
        while(top <= bottom && left <= bottom)
        {
            for (int i = left; i <=right ; i++) {
                a[top][i] = (flag==true)? 'o':'x';
            }
            top++;
            for (int i = top; i <=bottom ; i++) {
                a[i][right] =  (flag==true)? 'o':'x';
            }

            right--;

            for (int i = right; i>= left; i--) {
                 a[bottom][i] =  (flag==true)? 'o':'x';

            }
            bottom--;

            for (int i = bottom; i >=top ; i--) {
                a[i][left] = (flag==true)? 'o':'x';
            }
            left++;
            flag = !flag;
        }

        for (int i = 0; i <x ; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(a[i][j]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int a[][] = { {10, 20, 30, 40},
                      {15, 25, 35, 45},
                      {27, 29, 37, 48},
                      {32, 33, 39, 50},
                    };

      // search(a,37);
       // printZigZag(a);

      // spiral(a);

       // diagonalPrint(a);

        rectangleXO(5,5);
    }
}
