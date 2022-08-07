package com.rohan;
import java.util.*;
public class stringBuilder {
    int rever(int ia){
        int f=0;
        while(ia != 0)
        {
            int remainder = ia % 10;
            f= f* 10 + remainder;
            ia = ia/10;
        }
        return f;
    }
 String [] revert(String sb[]){
  int n= sb.length;
  String riv[]= new String[n];

  int j=0;
  for( int i=n-1; i>=0; i--){
   riv [j++]= sb[i];


  }
return riv;
 }
 public static void main(String args[]){

  Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of words you want to enter:");
  int size = sc.nextInt();
     stringBuilder fc= new stringBuilder();//class not string builder use here
     String sb[] =new String[size];

     System.out.println("Enter the words to get the reverse order");
     for( int i=0; i<size;i++) {
  sb[i] = sc.next();
    }
    String[] get=fc.revert(sb);
     System.out.println("The reverse order of given number is:");
  for(int i=0; i<get.length; i++) {
      System.out.println(get[i]);

  }
  int dc = 1838;
     int rel =fc.rever(dc);
     System.out.println(rel);
 }
}
