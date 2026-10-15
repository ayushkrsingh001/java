public class ArrayOperations {
    public static void main(String[] args) {
        int[] a = {12, 45, 7, 89, 23};
        int sum = 0, max = a[0], min = a[0];

        for (int n : a) {
            sum += n;
            if (n > max) max = n;
            if (n < min) min = n;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}