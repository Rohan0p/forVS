package com.rohan;
import java.util.Scanner;
public class TwoDQuestions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,m;
        n= sc.nextInt();
        m=sc.nextInt();
        int spiral[][]= new int[n][m];
        for(int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                spiral[i][j]= sc.nextInt();
            }
        }
        System.out.println("Spriral order");
        int rowStart=0;
        int rowEnd = n-1;
        int colStart=0;
        int colEnd = m-1;
        while(rowStart <= rowEnd && colStart<=colEnd) {
            //1
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(spiral[rowStart][col] +" ");
            }
            rowStart++;
            for(int row= rowStart; row<=rowEnd; row++){
                System.out.print(spiral[row][colEnd] + " ");
            }
            rowStart--;
            for(int col= colEnd; col>=colStart; col--){
                System.out.print(spiral[rowEnd][col]+ " ");
            }
            colEnd--;
            for(int row= rowEnd; row>=rowStart; row--){
                System.out.print(spiral[row][colStart]+ " ");
            }
            colStart++;
            System.out.println();

        }

    }
}
