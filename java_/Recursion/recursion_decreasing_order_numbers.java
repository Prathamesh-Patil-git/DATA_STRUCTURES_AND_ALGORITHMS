public class recursion_decreasing_order_numbers {

    public static void decreasingNumbers(int n){

        if(n == 0){
            return;
        }

        System.out.print(n + " ");
        decreasingNumbers(n - 1);
    }

    public static void main(String[] args) {

        decreasingNumbers(10);
    }
}