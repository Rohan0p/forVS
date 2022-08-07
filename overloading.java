package com.rohan;


import java.util.*;

public class overloading {

    static int acc_num,late;
    static String title,aut_name;
    public static void Input(){
        overloading obj = new overloading();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the accession number of book:");
        acc_num=sc.nextInt();
        System.out.println("Enter the days late for submission:");
        late =sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the title of book:");
        title=sc.nextLine();
        System.out.println("Enter the author name:");
        aut_name=sc.nextLine();
    }
    public static void Display(){
        System.out.println();
        System.out.println("Number of accession is:"+acc_num);
        System.out.println("Number of days late:"+late);
        System.out.println("The title of the book:"+title);
        System.out.println("Name of the author:"+aut_name);
    }
    public static void Fine(){
        int fine;
        if(late==1){
            fine = late+2;
        }
        else
        fine =  late * 2;
        System.out.println("Your late submission fine is:"+fine);
    }
    public static void main(String[] args) {
        Input();
        Display();
        Fine();
     }
}
