package ru.kate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PalindromeWay2
{
    private static int getNumber()
    {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        try
        {
            int num = sc.nextInt();
            if (num<1000 || num >99999)
            {
                throw new InputMismatchException();
            }
            return num;
            }
        catch (InputMismatchException e)
        {
            System.out.println("You are wrong, try again ");
            return getNumber();
        }

    }
    private static int revers (int num) {
        int result = 0;
        while (num != 0) {
            //System.out.println(alter + "\t" + num%10);
            result = result * 10 + (num % 10);
            //number[i++] = num%10; // i--;
            num /= 10;}
            return result;
        }

        public static void main (String[]args){

            int num = getNumber();
            int[] number = new int[5];
            int i = 0; // i = 4;
            int alter = revers(num);
            //int save= num;

            System.out.println(alter == num? "Palindrome" : "Not Palindrome");
        }
    }
