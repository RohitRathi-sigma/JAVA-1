//WAP to calculate gross,dozen and left over.

import java.util.Scanner;
 public class A{
    public static void main(String[] args) {
        System.out.println("Enter the number of eggs:");
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int gross=n/144;
        int dozen=(n%144)/12;
        int leftover=(n%144)%12;
        System.out.println("Number of egg in gross:"+gross);
        System.out.println("Number of egg in dozen:"+dozen);
        System.out.println("Number of egg which are left:"+leftover);
    }
}