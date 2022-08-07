package com.rohan;
import java.util.Scanner;
public class ocj {
    //    Homework problems
    /* Input a string from the user.
     Create a new string called ‘result’ in which you will replace the letter ‘e’
     in the original string with letter ‘i’.
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence to replace e character with i");
        String result = sc.nextLine();
        System.out.println("e character is replaced by i:");
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == 'e') {
                System.out.print('i');
            } else {
                System.out.print(result.charAt(i));
            }
        }
        System.out.println();
        /*input an email from the user.
    You have to create a username from the email by deleting the part that comes after ‘@’.
    Display that username to the user.
*/
        System.out.println("Enter your email id");
        String em = sc.nextLine();
        System.out.println("Your username is:");
        for (int i = 0; i < em.length(); i++) {
            if (em.charAt(i) == '@') {
                break;
//            String are immutable
            } else {
                System.out.print(em.charAt(i));
            }
        }
        System.out.println();
        //Take an array of Strings input
// from the user & find the cumulative (combined) length of all those strings.
        System.out.println("How many words you have to enter");
        int size= sc.nextInt();
        int tolength=0;
        String arr[]= new String[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.next();
            tolength +=arr[i].length();
        }
        System.out.println("The number of character in your entered words");
        System.out.println(tolength);
    }
}

