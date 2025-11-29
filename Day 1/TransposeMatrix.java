public class TransposeMatrix {
    public int[][] TransposrConversion(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int transpose[][] = new int[cols][rows];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                transpose[j][i] = matrix[i][j];
            };
        }
        return transpose;
    }
    public static void main(String[] args) {
        TransposeMatrix tm = new TransposeMatrix();
        tm.TransposrConversion(new int[3][4]);
    }
}
