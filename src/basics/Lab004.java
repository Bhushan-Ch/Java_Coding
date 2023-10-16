package basics;

import java.util.Scanner;

public class Lab004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1-3 which you are in");
        int state = sc.nextInt();

        switch (state) {
            case 1 -> System.out.println("Next will be Yellow");
            case 2 -> System.out.println("Next will be Green");
            case 3 -> System.out.println("Next will be Red");
            default -> System.out.println("Invalid state...");
        }
    }

}
