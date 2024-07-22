package bba;

import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = sc.nextInt();
        sc.close();
        int length = 0;
        int temp = num;

        int sum;
        for(sum = 0; temp > 0; ++length) {
            temp /= 10;
        }

        System.out.println(length);

        for(temp = num; num > 0; num /= 10) {
            int rem = num % 10;
            sum = (int)(sum + Math.pow(rem, length));
        }

        if (temp == sum) {
            System.out.println("The number is a Armstrong");
        } else {
            System.out.println("Not a Armstrong Number");
        }

    }

}
