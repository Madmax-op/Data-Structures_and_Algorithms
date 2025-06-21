public class prog4 {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            System.out.print(ch++);
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            System.out.print(ch++ + " ");
            System.out.println(ch++);
        }
    }
}
