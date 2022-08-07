package com.rohan;
public class sorting {
    public static void print(int arry[]){
        for(int i= 0; i<arry.length; i++){
            System.out.print(arry[i]+" ");
        }

    }
    public static void printing(int afry[]){
        for(int i=0; i<= afry.length; i++){
            System.out.print(afry[i]+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Bubble sort ");
        int arr[]={7,8,2,1,3,68,4,493,392,495,564,90,20,56,47,28,21,79};
//        bubble sort
        //outer loop
        //n-1 indexes of array
        for(int i=0; i<arr.length-1; i++){
            //inner loop
            // for sorting
            for(int j =0; j<arr.length-i-1; j++){
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        print(arr);
        //selection sort
        System.out.println();
        System.out.println("Selection sort");
        //outer loop
        //to the n-1 indexes in array
        for(int i=0; i<arr.length-1;i++){
            int smallest=i;
            //inner loop
            //for sorting
            for(int j= i+1; j<arr.length; j++){
                if(arr[j]<arr[smallest]){
                    smallest= j;
                }
            }
            //swaping
            int temp= arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        print(arr);
        rohan();
    }
    private static void rohan(){
        System.out.println("my name is rohan");
    }

}
