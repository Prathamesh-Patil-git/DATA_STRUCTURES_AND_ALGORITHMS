public class remove_duplicates_in_a_string {

    public static void remove_duplicates( String str , int idx , StringBuilder newstr, boolean map[]){


        //Base case
        if( idx == str.length()){
            System.out.print(newstr);
            return;
        }

        char currchar = str.charAt(idx);

        if( map[currchar-'a'] == true){
            remove_duplicates(str, idx+1, newstr, map);
        }else{

            map[currchar - 'a'] =true;
            remove_duplicates(str, idx+1, newstr.append(currchar), map);
        }
    }

    public static void main(String[] args){
        
        String str = "apple";

        remove_duplicates(str, 0 ,new StringBuilder(""), new boolean[26]);
    }
    
}
