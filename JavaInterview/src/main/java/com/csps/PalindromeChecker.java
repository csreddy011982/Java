package com.csps;

public class PalindromeChecker {


    public static void main(String[] args) {

        String input = "radar";

        if(isPalindrome(input)){
            System.out.println("\"" + input + "\" is a palindrome!");
        }

        else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String input){
         String reversed =  new StringBuffer(input.toLowerCase()).reverse().toString();
        return input.equals(reversed);
    }
}
