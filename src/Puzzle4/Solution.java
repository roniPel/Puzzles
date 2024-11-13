package Puzzle4;

public class Solution {

    public int romanToInt(String s) {
        /**  SUBTRACTION:
         * I can be placed before V (5) and X (10) to make 4 and 9.
         * X can be placed before L (50) and C (100) to make 40 and 90.
         * C can be placed before D (500) and M (1000) to make 400 and 900.
         */


    }
    public void testSolution4(String s) {
        System.out.println("The Roman numeral: "+s+" is: "+romanToInt(s)+" in integer format." );
    }
}
