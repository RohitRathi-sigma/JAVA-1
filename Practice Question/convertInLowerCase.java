//WAP to enter the string & convert it into lower case.

import java.util.Scanner;

public class convertInLowerCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.nextLine();
        System.out.println("Original string:"+str);
        String lowerCaseString=str.toLowerCase();
        System.out.println("Result:"+lowerCaseString);
        sc.close();
    }
}
