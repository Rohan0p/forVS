package com.rohan;
public class recursion {
    static void towerOfHanoi(int n, String src, String help, String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from " +src+ " to " +dest);
            return;
        }
        towerOfHanoi(n-1, src , dest, help);
        System.out.println("Transfer disk "+n+" from " +src+ " to " +dest);
        towerOfHanoi(n-1, help, src, dest);
    }
    public static void main(String[] args) {
        System.out.println("Tower of hanoi");
        int n=3;
        int count =0;
        towerOfHanoi(n,"s","h","d");
        }
}
