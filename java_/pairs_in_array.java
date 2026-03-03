
public class pairs_in_array {
    
    public static void print_pair(int arr[][]){

        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{1},{2}};
        System.out.println("Pairs of array :");
        print_pair(arr);
    }
}
