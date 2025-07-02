public class prog14 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }
            for (char ch = 'B'; ch <= (char) ('A' + i - 1); ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}
