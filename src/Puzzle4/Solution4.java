package Puzzle4;

public class Solution4 {

    public int romanToInt(String s) {
        // Initialize previous, current, and next characters (for string manipulation)
        char prev, curr, next;
        // Initialize int variables (for conversion to int)
        int val, total = 0;

        // Iterate over string
        for (int i = 0; i < s.length(); i++) {
            // Set val for chars
            prev = i==0?' ':s.charAt(i-1);
            curr = s.charAt(i);
            //next = i==s.length()-1?' ':s.charAt(i+1);

            // Set val for int
            switch(curr) {
                case 'I':
                    val = 1;
                    break;
                case 'V':
                    val = 5;
                    break;
                case 'X':
                    val = 10;
                    break;
                case 'L':
                    val = 50;
                    break;
                case 'C':
                    val = 100;
                    break;
                case 'D':
                    val = 500;
                    break;
                case 'M':
                    val = 1000;
                    break;
                default:
                    val = 0;
            }

            /**  SUBTRACTION:
             * I can be placed before V (5) and X (10) to make 4 and 9.
             * X can be placed before L (50) and C (100) to make 40 and 90.
             * C can be placed before D (500) and M (1000) to make 400 and 900.
             */
            // Special Cases:
            // 4 or 9
            if(prev=='I' && (curr=='V' || curr=='X') ){
                switch (curr){
                    case 'V':
                        val = 3;
                        break;
                    case 'X':
                        val = 8;
                        break;
                }

            }
            // 40 or 90
            if(prev=='X' && (curr=='L' || curr=='C')){
                switch (curr){
                    case 'L':
                        val = 30;
                        break;
                    case 'C':
                        val = 80;
                        break;
                }
            }
            // 400 or 900
            if(prev=='C' && (curr=='D' || curr=='M')){
                switch (curr){
                    case 'D':
                        val = 300;
                        break;
                    case 'M':
                        val = 800;
                        break;
                }
            }
            total+=val;
        }
        return total;
    }
    public void testSolution4(String s) {
        System.out.println("The Roman numeral: "+s+" is: "+romanToInt(s)+" in integer format." );
    }
}
