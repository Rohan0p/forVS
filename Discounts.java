// Write a program for discount on laptop and desktop.
//Answer:-
package com.rohan;
import java.util.*;
public class Discounts {
    public static void main(String args[]){
//        Discounts on pc and laptop
        String name,address;
        int budget;
        char type;
        double payamt;
        double discount;
// Taking all necessary inputs from user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
         name= sc.nextLine();
        System.out.println("Enter your address");
        address = sc.nextLine();
        System.out.println("Enter your budget ");
        budget= sc.nextInt() ;

        System.out.println("To purchase laptop enter L");
        System.out.println("To purchase desktop enter D");

        type=sc.next().charAt(0);
//        If user press L for laptop.

        switch(type){
            case 'L':
                if(budget>0 && budget<=25000) {
                    discount=0/100;
                    payamt = budget-discount;
                    System.out.println("You have to pay this amount => \n" + payamt);
                }
                    else if(budget>25000 && budget<=57000){
                        discount=5.0/100*budget;
                        payamt=  budget - discount;
                        System.out.println("You have to pay this amount =>\n"+payamt);
                    }
                    else if (budget>57000 && budget<=10000){
                        discount=7.5/100*budget;
                        payamt=budget-discount;
                        System.out.println("You have to pay this amount => \n"+ payamt);
                }
                    else{
                        discount=10.0/100*budget;
                        payamt=budget-discount;
                        System.out.println("You have to pay this amount => \n"+ payamt);
                }
                    break;
//                    If user press D for desktop
            case 'D':
                if(budget>0 && budget<=25000) {
                    discount=5.0/100*budget;
                    payamt = budget-discount;
                    System.out.println("You have to pay this amount => \n" + payamt);
                }
                else if(budget>25000 && budget<=57000){
                    discount=7.5/100*budget;
                    payamt=  budget - discount;
                    System.out.println("You have to pay this amount =>\n"+payamt);
                }
                else if (budget>57000 && budget<=10000){
                    discount=10.0/100*budget;
                    payamt=budget-discount;
                    System.out.println("You have to pay this amount => \n"+ payamt);
                }
                else{
                    discount=15.0/100*budget;
                    payamt=budget-discount;
                    System.out.println("You have to pay this amount => \n"+ payamt);
                }
                break;
//                If user press unnecessary alphabet.
            default:
                System.out.println("Wrong entry");

        }

    }


}


