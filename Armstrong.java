package com.rohan;
import java.util.*;
public class Armstrong {
    public static void main(String args[]){
    int a =153, b ,count=0, digit, product, sum=0,z;

//    Scanner sc = new Scanner(System.in);
//    a= sc.nextInt();
        for(int g=1; g<=500; g++){
    z=a;
    while (z!=0){
        count=count+1;
        z/=10;
    }
        System.out.println(count);
    z=a;
    while(z>0){
        digit= z%10;
        product=1;
        for(int i=1; i<=count; i++){
            product=product*digit;
        }
        sum=sum+product;
        z=z/10;
    }
    if(sum==a) {
        System.out.println(sum);
    }


        }
    }
}