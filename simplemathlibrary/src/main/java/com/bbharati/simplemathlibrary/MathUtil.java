package com.bbharati.simplemathlibrary;

public class MathUtil {

    public static int addition(int... numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public static int subtraction(int fstNumber, int secNumber) {
        return fstNumber - secNumber;
    }

    public static int division(int fstNumber, int secNumber) {
        return fstNumber / secNumber;
    }

    public static int reminder(int fstNumber, int secNumber) {
        return fstNumber % secNumber;
    }
}
