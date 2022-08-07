package com.rohan;
import java.util.Scanner;
public class menu_driven {
    public static void main(String rohan[]){
        Scanner sc = new Scanner(System.in);
        int ch;//        Taking necessary input from user.
        System.out.println("Press 1: to check for palindrome number");
        System.out.println("Press 2: to check for perfect number ");
        ch= sc.nextInt();
//      In menu driven program we use switch statement.
        switch (ch) {
            case 1:
                int n, z, rev = 0;
                System.out.println("Enter a number to check if it is palindrome or not");
                n = sc.nextInt();
                z = n;
//          the number remain the same if we reversed it.
//           example-> 256 remain same if we reversed it
//                Logic to find palindrome number or not.
                while (z > 0) {
                    rev = (rev*10)+z%10;
                     z/=10;
                }
                if (rev == n) {
                    System.out.println("The number is palindrome number:-" + rev);
                }
                else {
                    System.out.println("The number is not palindrome number");
                }
                break;
//                Next case for perfect number
            case 2:
//                perfect number is sum of its factors.
//             example->6: 1+2+3=6. It is a perfect number.
//                logic for this program
                int c;
                System.out.println("Enter a number to check if it is perfect or not");
                c=sc.nextInt();
                int fact=0;
                for (int i = 1; i < c; i++) {
                    if (c % i == 0)
                        fact = fact + i;
                }
                System.out.println(fact);

                if(fact==c) {
                System.out.println("It is a perfect number.");
                }
                else {
                    System.out.println("It is not a perfect number.");
                }
                break;

                default:
                System.out.println("Wrong entry");
            }

        }
    }
