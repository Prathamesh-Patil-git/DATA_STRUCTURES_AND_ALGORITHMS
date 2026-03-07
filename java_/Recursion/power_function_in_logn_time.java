public class power_function_in_logn_time {

    public static int power_function(int a, int n){

        if (n == 0){
            return 1;
        }

        int half = power_function(a, n/2);
        int halfpowsq = half*half;


        if((n&1) == 1){
            return a * halfpowsq;
        }

        return halfpowsq;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 2;

        System.out.print("a ^ n : "+ power_function(a, n));
    }
}