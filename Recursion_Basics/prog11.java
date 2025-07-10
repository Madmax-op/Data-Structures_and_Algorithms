//Remove Duplicates in a String

class prog11 {
    public static void removeDuplicates (String str , int index , StringBuilder newStr , boolean[] map){
        if (index==str.length()){
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(index);
        if(map[currentChar-'a']==true){
            removeDuplicates(str, index+1, newStr, map);
        }else{
            map[currentChar-'a']=true;
            removeDuplicates(str, index+1, newStr.append(currentChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "vvivekaaman";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}