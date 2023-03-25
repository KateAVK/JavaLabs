package ru.kate;

import java.util.Scanner;


public class PalindromeWay3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        if (num.length()!=5)
        {
            System.out.println("Error of the entered data");
            return;
        }
        StringBuffer sb = new StringBuffer();
        sb.append(num);
        String reverse = sb.reverse().toString();
        if (num.equals(reverse)) {System.out.println("It is palindrome");}
        else {System.out.println("it is not palindrome");}

    }
}
