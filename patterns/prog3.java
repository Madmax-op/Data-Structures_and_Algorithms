public class prog3 {
    public static void main(String[] args) {
        int number = 1;

        for (int i = 0; i < 3; i++) {       // 3 rows
            for (int j = 0; j < 3; j++) {   // 3 columns
                System.out.print(number);
                number++;
            }
            System.out.println();  
        }
    }
}
