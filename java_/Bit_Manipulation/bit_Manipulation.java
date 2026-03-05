public class bit_Manipulation {

    public static void main(String[] args) {
        
        int a = 5;
        int n = 4;

        a = a^n;
        n = a^n;
        a = a^n;
    
        

        System.out.println("a = " + a + " b = " + n);
    }
}