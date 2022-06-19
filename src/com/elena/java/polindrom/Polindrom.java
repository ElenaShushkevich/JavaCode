package com.elena.java.polindrom;

public class Polindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121121));
    }

    public static boolean isPalindrome(int number){
        int initialNumber = Math.abs(number);
        number = Math.abs(number);
        int palindrom=0;
        while(number>0){
            palindrom = palindrom*10+number%10;
            number = number/10;
        }
        return  palindrom==initialNumber;
    }
}
