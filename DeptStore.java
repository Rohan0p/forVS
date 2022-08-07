package com.rohan;
import java.util.Scanner;
public class DeptStore {
    int cust_num;
    String name;
    double amt;
    double vat;
  void input(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter customer number:");
        cust_num = sc.nextInt();
        System.out.print("Enter customer name:");
        String buf= sc.nextLine();//To avoid unnecessary code jump.
        name=sc.nextLine();
        System.out.print("Amount of purchase:");
        amt=sc.nextDouble();
      System.out.println();
    }
    void calculate(){
        vat =(amt*0.07);
        amt= amt+vat;
        System.out.println("Vat is:"+vat);
        System.out.println("Final amount is:"+amt);
    }
    void Display(){
        System.out.println("Customer number is:"+cust_num);
        System.out.println("Customer name is:"+name);
        System.out.println("Amount of purchase:"+ amt);
    }
    public static void main(String[] args) {
        DeptStore fc= new DeptStore();
        fc.input();
        fc.Display();
        fc.calculate();
    }
}
