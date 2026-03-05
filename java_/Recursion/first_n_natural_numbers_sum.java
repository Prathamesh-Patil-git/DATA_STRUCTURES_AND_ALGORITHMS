public class first_n_natural_numbers_sum {
    

    public static int sum_of_first_n_natural_numbers(int n){

        if(n == 1) return 1;
        return n + sum_of_first_n_natural_numbers(n-1);
    }

    public static void main(String[] args) {
        
        System.out.print(sum_of_first_n_natural_numbers(5));
    }
}
