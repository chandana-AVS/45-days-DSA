import java.util.Arrays;
import java.util.Scanner;
class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        boolean[] r=new boolean[m];
        boolean[] c=new boolean[n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    r[i]=true;
                    c[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(r[i] || c[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
 class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SetMatrixZeroes solver = new SetMatrixZeroes();
        
        // 1. Get matrix dimensions
        System.out.print("Enter number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = scanner.nextInt();
        
        int[][] matrix = new int[m][n];
        
        // 2. Get matrix elements
        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // 3. Process and Print
        solver.setZeroes(matrix);
        System.out.println("\nResult Matrix:");
        System.out.println(Arrays.deepToString(matrix));
        
        scanner.close();
    }
}


