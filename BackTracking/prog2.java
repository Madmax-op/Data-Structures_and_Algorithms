//Find Subsets

public class prog2 {
    public static void findSubsets (String str , String ans , int i){
        if ( i== str.length()){
            System.out.print(" "+ans);
            return;
        }
        //Yes
        findSubsets(str, ans+str.charAt(i), i+1);
        //No
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "vivek";
        findSubsets(str, "", 0);
    }
}
