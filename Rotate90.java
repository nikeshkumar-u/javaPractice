public class Rotate90 {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = a.length;
        int[][] a1 = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a1[j][n - 1 - i] = a[i][j];
            }
        }

        for (int k = 0; k < a1.length; k++) {
            for (int l = 0; l < a1[0].length; l++) {
                System.out.print(a1[k][l] + " ");
            }
            System.out.println();
        }
    }
}
