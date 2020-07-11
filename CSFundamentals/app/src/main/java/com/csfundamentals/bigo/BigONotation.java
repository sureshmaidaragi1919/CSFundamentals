package com.csfundamentals.bigo;

/*
Source Berek Banas
*/

public class BigONotation {

    /*  Analysis
     *
     *  example 1 :  45n^3 + 20n^2+ 19 = 84
     *
     *                      45n^3 + 20n^2+ 19 = 459 (n=2)
     *
     *                           45n^3 + 20n^2+ 19 = 47,059 (n=10)
     *
     *                                45n^3 = 45000
     *
     *                                      O(N^3)
     *
     * What is going to be covered O(1)
     *                              O(N)
     *                                O(N^2)
     *                                  O(logN)
     *                                     O(nlogN)
     * */


    private int[] theArray;
    private int arraySize;
    private int itemsInArray = 0;
    static long startTime;
    static long endTime;

    public static void main(String[] args) {

    }


    /*                          O(1)
     *  What this algorithm does or what this notation means is?
     *
     * its going to be an algorithm that's going to execute in
     * the same amount of time regardless of amount of data.
     *
     *                          OR
     *
     *  Its going to be execute in the same amount of time no
     *  matter how big the array is
     *
     * */

    public void addItemToArray(int newItem) {

        theArray[itemsInArray++] = newItem;
        //These is an example of order of 1
        // it doesn matter 10,000 item array or 5item array
    }

}
