
public class bubble_sort {

    public static void bubble__sort(int arr[]){

        for(int i = 0; i< arr.length-1; i++){

            boolean check = false; 

            for(int j = 0 ; j<arr.length-1-i; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;

                    check = true;
                }
            }

            if(!check){
                break;
            }
        }
    }

    public static void display_arr(int arr[]){

        for( int val : arr){
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {4,3,2,1};
        display_arr(arr);
        System.out.println();
        bubble__sort(arr);
        display_arr(arr);



    }
}