//tiling Problem

public class prog10 {
    public static int tilingProblem(int n){
        if (n ==0 ||  n==1){
            return 1;
        }
        //vertical
        int fnm1 = tilingProblem(n-1);
        //horizaontal
        int fnm2 = tilingProblem(n-2);
        //totalways
        int totways =fnm1+fnm2;
        return totways;
    }
    public static void main (String [] args){
        System.out.println(tilingProblem(6));

    }
}
