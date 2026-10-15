7(a) Maximum and Second Maximum Without Duplicates
public class MaxSecondMax {
    public static void main(String[] args) {
        int[] a = {23, 45, 67, 23, 89, 67};
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : a) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n < max && n > second) {
                second = n;
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Second Maximum: " + second);
    }
}


7(b) Sort Names in Ascending Order
public class SortNames {
    public static void main(String[] args) {
        String[] names = {"Rohan", "Amit", "Priya", "Neha", "Karan"};

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String t = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = t;
                }
            }
        }

        for (String n : names)
            System.out.println(n);
    }
}


7(c) Addition of Two Matrices
public class MatrixAddition {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print((a[i][j] + b[i][j]) + " ");
            System.out.println();
        }
    }
}


7(d) 3×3 Matrix Multiplication
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int sum = 0;

                for (int k = 0; k < 3; k++)
                    sum += a[i][k] * b[k][j];

                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}