package ru.kate;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";
        int number = 0;
        try {
            number = Integer.parseInt(a);
        }
        catch (NumberFormatException e){
            System.out.println("Error of entered data");
            return;
        }
        while (number!=0)
        {
            b+=number%10;
            number/=10;
        }
        if (a.equals(b)){System.out.println("Palindrome");}
        else { System.out.println("Not Palindrome");}

}}

