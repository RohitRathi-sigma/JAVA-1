//Swap two number using temp vatiable.

import java.util.Scanner;
 public class ingTemp{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x=s.nextInt();
        System.out.println("Enter the value of y:");
        int y=s.nextInt();
        int temp=x;
        x = y;
        y = temp;
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
 }