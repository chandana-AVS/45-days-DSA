//this code is to rotate the matrix by 90 degrees clockwise


import java.util.Scanner;
//import java.util.*;
class RotateMatrix {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //this is for transposing the matrix that is converting rows into columns and columns into rows

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int l=0;
            int r=n-1;
            while(l<r){
                int temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
                l++;
                r--;
            }
        }
        
    }
}

class RunRotateMatrix{
    public static void main(String[] args) {
        RotateMatrix rm=new RotateMatrix();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int n=sc.nextInt();
        int[][] matrix=new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        rm.rotate(matrix);
        System.out.println("Rotated Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


/*  o/p:
Enter the size of the matrix:
4
Enter the elements of the matrix:
1 2 3 4 
2 3 4 5
3 4 5 6
4 5 6 7
Rotated Matrix:
4 3 2 1 
5 4 3 2 
6 5 4 3 
7 6 5 4     */