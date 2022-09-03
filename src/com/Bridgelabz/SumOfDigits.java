package com.Bridgelabz ;
import java.util.Scanner ;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("********************************************");
        System.out.println(" Welcome to Sum Of Digits Program...");
        System.out.println("********************************************");

        System.out.println(" Please Enter A Number = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Sum = 0;

        while (num > 0) {
            Sum = Sum + num % 10;
            num = num / 10;
        }
        System.out.println(" Sum of digits is = " + Sum);

    }
}

