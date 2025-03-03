package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder stringBuilder = new StringBuilder();
        while (start < stop) {
            stringBuilder.append((int) Math.pow(start, exponent)); //casts result that was a double into an int
            start = start + step;
        }
        return stringBuilder.toString();

        //return null;
    }

    public static String getRange(int start, int stop, int step) {
        StringBuilder stringBuilder = new StringBuilder();
        while (start < stop) {
            stringBuilder.append(start);
            start = start + step;
        }
        return stringBuilder.toString();
        //return null;
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);

        //return null;
    }

    public static String getRange(int stop) {
        return getRange(0, stop, 1);

        //return null;
    }

    /*
     * natural break
     */

    public static boolean isNumberEven(int toTest) {
        if (toTest % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isNumberOdd(int toTest) {
        if (toTest % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder stringBuilder = new StringBuilder();
        while (start < stop) {
            if (isNumberEven(start)) {
                stringBuilder.append(start); //casts result that was a double into an int
            }
            start = start + 1;
        }
        return stringBuilder.toString();
        //return null;
    }

    public static String getOddNumbers(int start, int stop) {
        StringBuilder stringBuilder = new StringBuilder();
        while (start < stop) {
            if (isNumberOdd(start)) {
                stringBuilder.append(start); //casts result that was a double into an int
            }
            start = start + 1;
        }
        return stringBuilder.toString();
        //return null;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 2);
        //return null;
    }

}
