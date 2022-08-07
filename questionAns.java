package com.rohan;
import java.util.Scanner;
public class questionAns {
    // Q.1-Enter 3 numbers from the user & make a function to print their average.
   /* public static void avrg(int a,int b, int c){
        int avg= (a+b+c)/2;
        System.out.println(avg);
        return;
    }
    public static void main(String args[]){
        System.out.println("Enter three numbers for average ");
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        avrg(a,b,c);
}
    */
   //Q.2- Write a function to print the sum of all odd numbers from 1 to n.
   /* public static void oddSum(int n, int sum){
        for ( int i=1; i<=n; i++){
            //logic for odd number if remainder of number i not equal to 0.
            if(i%2!=0) {
                sum = sum + i;
                }
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int sum=0;
        oddSum(n,sum);
  }
    */
    // Q.3-Write a function which takes in 2 numbers and returns the greater of those two.
   /* public static void max(int a ,int b){
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        max(a,b);
    }
*/
    //Q.4-Write a function that takes in the radius
    // as input and returns the circumference of a circle.
   /*     public static void main(String args[]){
            Scanner sc= new Scanner(System.in);
            int r=sc.nextInt();
            circum(r);

        }
        public static void circum(int r){
            double cir=Math.PI*(r*2);
            System.out.println(cir);
        }
       */
/* Q.5-Write a function that takes in age as input
and returns if that person is eligible to vote or not.
    A person of age > 18 is eligible to vote.*/

   /*  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        eligible(age);
    }
    public static void eligible(int age){
        if(age>=18)
            System.out.println("You are eligible to vote.");
        else
            System.out.println("You are not eligible to vote.");
        return;
    }
*/
    /*
    //Q.6-Write an infinite loop using do while condition.
    public static void main(String args[]){
        int a=1;
        do {
            a++;
            System.out.println(a);
        }
        while(a>0);
//Make sure to terminate the  execution after running.
    }
    */
    /*
//   Q.7- Write a program to enter the numbers           -copy
//    till the user wants and at the end it should display the count of positive, negative and zeros entered.
    public static void main(String args[]){
        int num,count=0 , posi=0,negi=0,zero=0;
        char opt='Y';

        Scanner scan= new Scanner(System.in);

        while(opt=='Y'|| opt=='y'){
            ++count;
            System.out.println("Enter the number");
            num=scan.nextInt();
            if(num==0)
                ++zero;
            else if(num>0)
                ++posi;
            else if (num<0)
                ++negi;

            System.out.println("Enter Y to continue to enter the number or Enter N to discontinue");
            opt=scan.next().charAt(0);
        }
        System.out.println("Number of entries:"+count);
        System.out.println("Number of positive enters:"+posi);
        System.out.println("Number of Zeros enters:"+zero);
        System.out.println("Number of negatives enters:"+negi);
}
*/
    /*
//   Q.8-Two numbers are entered by the user, x and n.
//   Write a function to find the value of one number raised to the power of another i.e. xn. copy
    public static void main(String args[]){
        int x, n;
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();
        n=sc.nextInt();
        int pow= Pow(x,n);
        System.out.println(pow);


    }
    public static int Pow(int x,int n){
        if(n==0)
            return 1;
        else
        return x* Pow(x,n-1);

    }
    */
/* Q.9-Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
   Q.10 - Write a program to print Fibonacci series of n terms where n is input by user :
            0 1 1 2 3 5 8 13 21 .....
    In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
            (BONUS)
            I mixed these two question using switch statement.
 */
    /*public static void main(String args[]){
        double a,b;
        int choice;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                a=sc.nextDouble();
                b=sc.nextDouble();
                gcd(a,b);
                break;
            case 2:
                a=sc.nextDouble();
                fabonic(a);
                break;
            default:
                System.out.println("Wrong entry");
        }
    }
    public static void gcd(Double a, Double b){
        double gfd=1;
        for(double i=1; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
               gfd = i;
            }
        }
        System.out.println(gfd);
    }
    public static void fabonic(double a){
        double z=0, x=0, y=1;
        while(z<=a){
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;
        }
    }
    */
}

