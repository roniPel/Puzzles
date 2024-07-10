package Puzzle1;

public class Solution1 {
    public String getWrongAnswers(int N, String C) {
        StringBuilder res = new StringBuilder();
        char addChar = ' ';
        for(int i=0; i < N; i++) {
            switch (C.charAt(i)){
                case 'A':
                    addChar = 'B';
                    break;
                case 'B':
                    addChar = 'A';
                    break;
                default:
                    addChar = ' ';
            }
//            char addChar = switch (C.charAt(i)) {
//                case 'A' -> 'B';
//                case 'B' -> 'A';
//                default -> ' ';
//            };
            res.append(addChar);
        }
        return res.toString();
    }

    public void testSolution1(int N, String C) {
        System.out.println("The answer is: "+getWrongAnswers(N,C));
    }

}

