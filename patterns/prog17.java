public class prog17 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            int[] row = new int[i];
            for (int j = 0; j < i; j++) {
                row[j] = num++;
            }

            if (i % 2 == 0) {
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print(row[j] + " ");
                }
            } else {
                for (int j = 0; j < i; j++) {
                    System.out.print(row[j] + " ");
                }
            }
            System.out.println();
        }
    }
}
