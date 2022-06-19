package com.elena.java.shareddigit;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15, 22));
    }
    public static boolean hasSharedDigit(int number, int number2) {
        if ((number >= 10 && number <= 99) && (number2 >= 10 && number2 <= 99)) {
            while (number != 0) {
                int firstD = number / 10;
                int secondD = number % 10;
                int thirdD = number2 / 10;
                int fourD = number2 % 10;
                if ((firstD == thirdD || firstD == fourD) || (secondD == thirdD || secondD == fourD)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}


