//Swap two number without using temp vatiable.

import java.util.Scanner;
 public class swapNumWithoutUsingTemp{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x=s.nextInt();
        System.out.println("Enter the value of y:");
        int y=s.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
 }