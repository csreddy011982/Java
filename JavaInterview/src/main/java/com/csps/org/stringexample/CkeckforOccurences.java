package com.csps.org.stringexample;

public class CkeckforOccurences {

	public static void main(String[] args) 
    {
        String str= "InterviewBit";
        char ch = 'e';  //character to look for occurrences is e
        int count = 0; 
        for (int i = 0; i < str.length(); i++) 
          {
          if (str.charAt(i) == ch) 
              {
              count++;
              }
          }
     System.out.println("The character '" + ch + "' appears " + count + " times in the given string '" + str + "'.");
     }

}
