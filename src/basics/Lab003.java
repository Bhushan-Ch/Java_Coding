package basics;

import java.util.Scanner;

public class Lab003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Score..");

        int score=sc.nextInt();
        char grade=0;
        if (score >=90 && score<=100)
        {
            grade='A';
        }
        else if(score >=80 && score<90)
        {
            grade='B';
        }
        else if (score >=70 && score<80)
        {
            grade='C';
        }
        else if (score >=60 && score<70)
        {
            grade='D';
        }
        else
        {
            grade='F';
        }
        System.out.println("Your grade is "+ grade);
    }
}
