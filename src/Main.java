import Puzzle1.Solution1;
import Puzzle2.Solution2;

public class Main {
    public static void main(String[] args) {
        TestPuzzle1();
        TestPuzzle2();

    }

    private static void TestPuzzle2(){
        Solution2 solution2 = new Solution2();
        solution2.testSolution2(2,3, new int[][]{{0, 0, 1}, {1, 0, 1}} );
        solution2.testSolution2(2,2, new int[][]{{1,1},{1,1}} );
    }
    private static void TestPuzzle1(){
        Solution1 solution1 = new Solution1();
        solution1.testSolution1(6,"AAABBB");
        solution1.testSolution1(3,"ABA");
    }
}
