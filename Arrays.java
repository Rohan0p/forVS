package com.rohan;
import java.util.*;
public class Arrays {
    public static void main(String args[]){
        String Names[]=new String[3];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i< Names.length; i++){
          Names[i]=sc.nextLine();
        }

        for(int i=0; i<Names.length; i++){

                System.out.println(Names[i]);

        }
    }
}
