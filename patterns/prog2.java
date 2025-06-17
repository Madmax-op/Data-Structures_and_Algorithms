import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no. of rows required:");
        int a = sc.nextInt();
        System.out.println("Enter the no.of coloumns required");
        int b = sc.nextInt();
        for (int i = 1; i <=a; i++) {        // 4 rows
            for (int j = 1; j <=b; j++) {    // 6 stars per row
                if (i==1 || j==1 || i==a || j==b){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();           // Newline after each row
        }
    }
}
