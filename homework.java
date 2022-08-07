package com.rohan;

public class homework {
    void rohan(float x,float y){

    }


    int rohan(int m, int c){

      int fc=m+c;

        return fc;
    }
   int rohan(int k,double t){
     double cc= k+t;


        return (int)cc;
    }

    public static void main(String args[]){
        System.out.println("Hello");
        int a=1,b=10,c=20;
        homework fe= new homework();
       int ee= fe.rohan(a,b);
       int cc= fe.rohan(a,b);
        System.out.println(ee+"\n"+cc);
        System.out.format("hello %d %d %3d",b,a,c);



    }
}
