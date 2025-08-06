package oops;
class Matrix {
    int[][] data; // to store matrix values
    int rows, cols;

    // Constructor to initialize the matrix
    Matrix(int[][] input) {
        rows = input.length;
        cols = input[0].length;
        data = new int[rows][cols];

        // Copy input data into the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = input[i][j];
            }
        }
    }

    // Method to multiply two matrices
    Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            System.out.println("Multiplication not possible!");
            return null;
        }

        int[][] result = new int[this.rows][other.cols];

        // Matrix multiplication logic
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }

        return new Matrix(result);
    }

    // Method to display the matrix
    void display() {
        for (int[] row : data) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
public class Main1 {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4}
        };

        int[][] B = {
            {5, 6},
            {7, 8}
        };

        // Create matrices using constructor
        Matrix m1 = new Matrix(A);
        Matrix m2 = new Matrix(B);

        System.out.println("Matrix A:");
        m1.display();

        System.out.println("Matrix B:");
        m2.display();

        // Multiply matrices
        Matrix result = m1.multiply(m2);

        if (result != null) {
            System.out.println("Result of A x B:");
            result.display();
        }
    }
}

