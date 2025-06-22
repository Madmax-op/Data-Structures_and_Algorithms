public class prog5 {
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print("  ");
            }
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = 0; j < i; j++) {
                    System.out.print((char)('A' + j) + " ");
                }
                for (int j = i - 2; j >= 0; j--) {
                    System.out.print((char)('A' + j) + " ");
                }
            }
            System.out.println();
        }
    }
}
