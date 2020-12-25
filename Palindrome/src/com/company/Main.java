package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //String originalWord;

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter word to check for palindrome:");
        Palindrome p = new Palindrome();
        p.checkPalindrome(input1.nextLine());

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter word to check for number of words:");
        CamelCase c = new CamelCase();
        System.out.println(c.checkCamelCase(input2.nextLine()));

    }
}
