package com.dada.array;

import java.util.Scanner;

/**
 * Created by dnalband on 23/05/15.
 */
public class JumpArrayElements {

    public static void main(String[] args) {
       // Scanner scanner = new Scanner( System.in);

       // String totalTests = scanner.nextLine();

        int array [] = {0,0,1,1,1,0};

        int jump = 3;
        int currentIndex =0;
       // int oneCounts  =0;
        for (int i = 0; i < array.length; i++) {

              if(array[i]==0)
              {
                  currentIndex =i;

              }
            else if(array[i] ==1)
            {
               currentIndex = i+jump;
                if(currentIndex> (array.length-1))
                {
                    System.out.println("winner");
                    break;
                }
                else if(array[currentIndex]==0){
                    i=currentIndex;

                }
                else {
                    System.out.println("Loser");
                    break;
                }


            }


        }



    }
}
