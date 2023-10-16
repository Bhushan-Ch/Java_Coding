package basics;

import java.util.Scanner;

public class Lab001 {
    public static void main(String[] args) {

        System.out.println("Enter the value of a b c \n I will give you maximum value");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Your inputs are \n"+a+""+b+""+c);

        if (a>b && a>c)
        {
            System.out.println("Max is " +a);
        }
        if (b>a && b>c)
        {
            System.out.println("MAx is " +b);
        }
        if (c>a && c>b)
        {
            System.out.println("Max is " +c);
        }
        else
        {
            System.out.println("Invalid");
        }


    }
}
