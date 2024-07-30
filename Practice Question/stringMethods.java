//WAP to implement all string class method.

public class stringMethods {
    public static void main(String[] args) {
        String str = "Jai Mahakal";
        String str2 = "Ki";
        System.out.println(str);
        System.out.println(str2);

        // length 1
        System.out.println("Length: " + str.length());
        System.out.println("Length: " + str2.length());

        // charAt 2
        System.out.println("Character at index 1: " + str.charAt(1));

        // substring 3
        System.out.println("Substring from index 7: " + str.substring(7));
        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));

        // compareTo 4
        System.out.println("Compare to 'Hello': " + str.compareTo(str2));

        // compareToIgnoreCase 5
        System.out.println("Compare to ignore case 'hello, world!': " + str.compareToIgnoreCase("hello, world!"));

        // startsWith  6
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));

        // endsWith   7
        System.out.println("Ends with 'World!': " + str.endsWith("World!"));

        // indexOf   (8)
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Index of 'World': " + str.indexOf("World"));

        // lastIndexOf  (9)
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

        // toUpperCase  10
        System.out.println("To upper case: " + str.toUpperCase());

        // toLowerCase   11
        System.out.println("To lower case: " + str.toLowerCase());

        // trim    12
        System.out.println("Trim: '" + "   Hello, World!   ".trim() + "'");

        // replacem    13
        System.out.println("Replace 'l' with 'p': " + str.replace('l', 'p'));
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // concat    14
        System.out.println("Concat with '': " + str.concat(str2));

        // replaceFirst  15
        System.out.println("Replace first 'l' with 'p': " + str.replaceFirst("l", "p"));
    }
}