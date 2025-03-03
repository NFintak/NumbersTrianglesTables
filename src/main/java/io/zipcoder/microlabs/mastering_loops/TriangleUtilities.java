package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++) {
            stringbuilder.append("*");
        }
        return stringbuilder.toString();
        //return null;
    }

    public static String getTriangle(int numberOfRows) {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 1; i < numberOfRows; i++) {
            stringbuilder.append(getRow(i)).append("\n");
        }
        return stringbuilder.toString();


        //return null;
    }

    // hmm
    
    public static String getSmallTriangle() {
        return getTriangle(5);
        //return null;
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
        //return null;
    }
}
