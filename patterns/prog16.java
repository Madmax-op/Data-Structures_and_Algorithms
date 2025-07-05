public class prog16 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            System.out.print(num++);
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            if (i != n) {
                System.out.print(" " + num++);
            }
            System.out.println();
        }
    }
}
