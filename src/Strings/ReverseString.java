package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String...");
        StringBuffer sb1;
        sb1 = new StringBuffer(sc.next());
        sb1.reverse();
        System.out.println(sb1);




    }
}
