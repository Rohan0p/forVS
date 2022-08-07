package com.rohan;

import java.util.Scanner;
public class GST {
    public static void gst(float gst ,int size){
        if(gst==0){
            return;
        }
        else{
            float components[]=new float[size];
           float AmtGst= gst;

        }
        return;
    }
    public static void Discount(float dis, int size) {
    if(dis==0){
        return;
        }
     else{
         Scanner sc = new Scanner(System.in);
        float components[]=new float[size];
         for(float i=0; i<components.length; i++);{

//            components[i]=sc.nextFloat();
        }

        float AmtDis=dis*components[1];
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        float components[]=new float[size];
        for(int i=0; i< components.length; i++) {
            components[i] = sc.nextInt();
        }
            float gst,dis;
            gst=sc.nextFloat();
            gst/=100;
            dis=sc.nextFloat();
            dis/=100;
//            gst = gst(gst,size);
//            dis=Discount(dis,components[1]);
//            float AmtPay= components[]-dis+gst;
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();


    }
}
