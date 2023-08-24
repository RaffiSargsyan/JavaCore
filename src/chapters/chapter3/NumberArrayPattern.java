package chapters.chapter3;

public class NumberArrayPattern {
    public static void main(String[] args) {
        int[][] numberArray = new int[4][];

        int num = 1;
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                numberArray[i][j] = num;
                num++;
            }
        }

        for (int[] row : numberArray) {
            for (int numInRow : row) {
                System.out.print(numInRow + " ");
            }
            System.out.println();
        }
    }
}
