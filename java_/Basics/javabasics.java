
public class javabasics {

    
    public static void main(String[] args) {
        
     
        StringBuilder sb = new StringBuilder("abc");


        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("dsjfsdlkhkhkhhhhh");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        

    }
}