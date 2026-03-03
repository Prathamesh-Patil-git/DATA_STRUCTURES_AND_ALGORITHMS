public class bubblesort {
    
    public static void bubble_sort(int []arr){
        
        for(int j = 0; j < arr.length-1; j++){
            for(int i = 0 ; i< arr.length-1-j; i++){
                if(arr[i] > arr[i+1]){
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp; 
                }
            }
        }
    }

    public static void print_array(int []arr){

        for(int j = 0; j<arr.length ; j++){
            System.out.print(arr[j]);
        }
    }

    public static void main(String []args){
        int []arr = {5,3,6,4,2,7};
        bubble_sort(arr);
        print_array(arr);
    }
}
