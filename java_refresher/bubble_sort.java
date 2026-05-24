public class bubble_sort {
    
    public static void bubble__sort(int arr[]){

        for(int j = 0; j<arr.length-1;j++){
            for(int i = 0; i<arr.length-1-j;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void display_arr(int arr[]){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args){
        int arr[] = {5, 2, 8, 1};

        bubble__sort(arr);
        display_arr(arr);
    }
}
