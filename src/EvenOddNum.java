import java.util.Scanner;

public class EvenOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if (num%2==0)
            System.out.println(num+" Entered numb is Even");
        else
            System.out.println(num+" Entered numb is Odd number");
    }
}
