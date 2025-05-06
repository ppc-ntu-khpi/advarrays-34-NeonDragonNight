package src;

import java.util.Arrays;

public class calc {

    public static int[][] transpose(int[][] matrix) {
        return Arrays.stream(matrix[0])
        .mapToObj(col -> Arrays.stream(matrix).mapToInt(row -> row[col])
        .toArray()).toArray(int[][]::new);
    }
}