package com.rohan;
import java.util.Scanner;
public class AnswerArrays {
    public static void main(String args[]){
//        Find the maximum & minimum number in an array of integers.
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
         int arr[]=new int[size];
      for(int i=0; i<arr.length; i++){
          arr[i]=sc.nextInt();
      }
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
      for(int i=0; i<arr.length; i++){
          //Hard to understand so take time
          //logic all if work of loop
          if(arr[i]<min) {
// It will store the first value of array in max
// variable after that it will compare to other variables.
              min = arr[i];
          }
// It will store the first value of array in max
// variable after that it will compare to other variables.
            if(arr[i]>max) {
                max = arr[i];
            }
          }
        System.out.println(min);
        System.out.println(max);
      }

    }


