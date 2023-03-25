package ru.kate;

public class Alphabet
{
    public static void main(String[] args)
    {
        for (char i = 'A'; i <'Z'; i++)
        {
            char c = i;
            int a = (int)(c);
            System.out.println(i + " - " + a);
        }
  
        for (char i = 'a'; i <'z'; i++)
        {
            char c = i;
            int a = (int)(c);
            System.out.println(i + " - " + a);
        }
    }
}
