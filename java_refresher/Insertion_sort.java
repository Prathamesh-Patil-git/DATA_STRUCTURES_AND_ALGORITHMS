public class Insertion_sort {

    public static void InsertionSort(int arr[]){

        for(int i = 1; i< arr.length ; i++){

            int curr = arr[i];
            int prev = i-1;

            while (prev >= 0 && arr[prev] > curr) {
                
                arr[prev +1] = arr[prev];
                prev--;
            }

            arr[prev+1]=curr;


        }
    }

    public static void DisplayArr(int arr[]){

        for(int val : arr){
            System.out.print(val+ " ");
        }
    }

    
    public static void main(String[] args) {
        
        int arr[] = {9,7,5,4,3,2};

        DisplayArr(arr);
        InsertionSort(arr);
        System.out.println();
        DisplayArr(arr);

    }
}
