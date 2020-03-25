import java.util.Random;

public class MyArray {

    Random rnd = new Random();

    public int maxLength(int[][] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = rnd.nextInt(2);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        int max = 0;
        for (int m = 0; m < array.length; m++) {
            int inRow = 0;
            for (int n = 0; n < array.length; n++) {
                if (array[m][n] == 1) inRow++;
                else inRow = 0;
                if (inRow > max) max = inRow;
            }
        }
        for (int m = 0; m < array.length; m++) {
            int inCollumn = 0;
            for (int n = 0; n < array.length; n++) {
                if (array[n][m] == 1) inCollumn++;
                else inCollumn = 0;
                if (inCollumn > max) max = inCollumn;
            }
        }
        System.out.println();
        System.out.println(max);
        return max;
    }
}
