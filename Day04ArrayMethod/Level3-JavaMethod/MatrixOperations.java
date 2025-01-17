import java.util.Random;

public class MatrixOperations {

    // Method to create a random matrix with given rows and columns
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        // Generating random values between 1 and 9 for the matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(9) + 1;
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        // Adding corresponding elements of both matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        // Subtracting corresponding elements of both matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            throw new IllegalArgumentException("Matrix multiplication is not possible: Column of matrix1 must be equal to row of matrix2.");
        }

        int[][] result = new int[rows1][cols2];

        // Multiplying matrices
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        // Transposing the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2 for determinant calculation.");
        }
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3 for determinant calculation.");
        }
        int determinant = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                          - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                          + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return determinant;
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2 for inverse calculation.");
        }
        int determinant = determinant2x2(matrix);
        if (determinant == 0) {
            throw new IllegalArgumentException("Matrix is singular, inverse cannot be calculated.");
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = (double) matrix[1][1] / determinant;
        inverse[0][1] = (double) -matrix[0][1] / determinant;
        inverse[1][0] = (double) -matrix[1][0] / determinant;
        inverse[1][1] = (double) matrix[0][0] / determinant;
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix (using the adjugate method)
    public static double[][] inverse3x3(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3 for inverse calculation.");
        }
        int determinant = determinant3x3(matrix);
        if (determinant == 0) {
            throw new IllegalArgumentException("Matrix is singular, inverse cannot be calculated.");
        }

        // Calculate the adjugate matrix
        double[][] adjugate = new double[3][3];
        adjugate[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        adjugate[0][1] = matrix[0][2] * matrix[2][0] - matrix[0][0] * matrix[2][2];
        adjugate[0][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        adjugate[1][0] = matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2];
        adjugate[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        adjugate[1][2] = matrix[0][1] * matrix[1][0] - matrix[0][0] * matrix[1][1];
        adjugate[2][0] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
        adjugate[2][1] = matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1];
        adjugate[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        // Find inverse by dividing adjugate by determinant
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adjugate[i][j] / determinant;
            }
        }
        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    // Method to display a matrix (for double values like inverse)
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(String.format("%.2f", element) + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Creating random matrices
        int[][] matrix1 = createRandomMatrix(3, 3);
        int[][] matrix2 = createRandomMatrix(3, 3);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Perform matrix operations
        System.out.println("\nMatrix Addition:");
        int[][] additionResult = addMatrices(matrix1, matrix2);
        displayMatrix(additionResult);

        System.out.println("\nMatrix Subtraction:");
        int[][] subtractionResult = subtractMatrices(matrix1, matrix2);
        displayMatrix(subtractionResult);

        System.out.println("\nMatrix Multiplication:");
        int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2);
        displayMatrix(multiplicationResult);

        System.out.println("\nTranspose of Matrix 1:");
        int[][] transposeResult = transposeMatrix(matrix1);
        displayMatrix(transposeResult);

        // Calculate and display determinants and inverses for 2x2 and 3x3 matrices
        System.out.println("\nDeterminant of Matrix 1 (3x3): " + determinant3x3(matrix1));
        System.out.println("\nInverse of Matrix 1 (3x3):");
        double[][] inverseMatrix1 = inverse3x3(matrix1);
        displayMatrix(inverseMatrix1);
    }
}
