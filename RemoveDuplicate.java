public class RemoveDuplicate {
    public static void main(String args[]){
        String str = "namandeepgupt";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
    public static void removeDuplicate
    (String str, int index, StringBuilder newstr, boolean map[]){
        if(index == str.length()){
            System.out.println(newstr);
            return;
        }
        else{
            char currentChar = str.charAt(index);
            if(map[currentChar-'a'] == true){
                removeDuplicate(str, index+1, newstr, map);
            }
            else{
                map[currentChar-'a'] = true;
                removeDuplicate(str, index+1, newstr.append(currentChar), map);
            }
        }
    }
}
