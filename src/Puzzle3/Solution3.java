package Puzzle3;

import java.text.NumberFormat;

public class Solution3 {
    public double getHitProbability(int R, int C, int[][] G) {
        int rows = G.length;
        int columns = G[0].length;
        double size = rows*columns;
        double count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(G[i][j] == 1){
                    count++;
                }
            }
        }
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMinimumFractionDigits(6);
        return Double.parseDouble(numberFormat.format(count/size));
    }
    public void testSolution3(int R, int C, int[][] G) {
        System.out.println("The hit probability is: "+getHitProbability(R,C,G));
    }
}
