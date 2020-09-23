package sep_2020;

import java.sql.Struct;
import java.util.Arrays;
import java.util.stream.Stream;

public class ZeroingMatrix {

    static void zeroingmatrix(int[][] matrix) {
        boolean [] row = new boolean[matrix.length];
        boolean [] col = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i = 0; i < row.length; i++){
            if(row[i]){
                setZeroRow(matrix, i);
            }
        }
        for(int j = 0; j < col.length; j++){
            if(col[j]){
                setZeroCol(matrix, j);
            }
        }
    }

    private static void setZeroCol(int[][] matrix, int col) {
        for(int i = 0; i < matrix.length; i++){
            matrix[i][col] = 0;
        }
    }

    private static void setZeroRow(int[][] matrix, int row) {
        for(int i = 0; i < matrix[0].length; i++){
            matrix[row][i] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,0}, {1,0,3},{6,0,8}};
        for (int [] t : matrix)
            System.out.println(Arrays.toString(t));
        System.out.println();
        zeroingmatrix(matrix);
//        System.out.println(Arrays.deepToString(matrix));
        for (int [] t : matrix)
        System.out.println(Arrays.toString(t));

    }

}
