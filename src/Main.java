import Puzzle1.Solution1;
import Puzzle2.Solution2;
import Puzzle4.Solution4;

public class Main {
    public static void main(String[] args) {
//        TestPuzzle1();
//        TestPuzzle2();
        TestPuzzle4();

    }

    private static void TestPuzzle4(){
        Solution4 solution4 = new Solution4();
        solution4.testSolution4("III");     // 3
        solution4.testSolution4("LVIII");   // 58
        solution4.testSolution4("MCMXCIV"); // 1994
    }

    private static void TestPuzzle2(){
        Solution2 solution2 = new Solution2();
        solution2.testSolution2(2,3, new int[][]{{0, 0, 1}, {1, 0, 1}} );
        solution2.testSolution2(2,2, new int[][]{{1,1},{1,1}} );
        solution2.testSolution2(3,1, new int[][]{{0, 0,1},{1, 1,1}} );
        solution2.testSolution2(4,-1, new int[][]{{0, 1, 1, 1, 0},{}} );
    }
    private static void TestPuzzle1(){
        Solution1 solution1 = new Solution1();
        solution1.testSolution1(6,"AAABBB");
        solution1.testSolution1(3,"ABA");
    }
}
