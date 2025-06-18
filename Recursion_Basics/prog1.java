//Print Numbers in Decreasing Orders

public class prog1 {
    public static void printDec (int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    public static void main (String [] args){
        int n= 15;
        printDec(n);
    }
}
