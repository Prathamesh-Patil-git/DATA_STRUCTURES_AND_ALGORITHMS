public class selection_sort {
    
    public static void SelectionSort(int arr[]){

        for(int i = 0; i< arr.length;i++){
            int smallest = i;
            for(int j = i+1; j<arr.length;j++){

                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void DisplayArr(int arr[]){

        for(int val : arr){
            System.out.print(val+ " ");
        }
    }

    public static void main(String[] args) {
     
        int arr[] = {9,8,6,5,4};
        DisplayArr(arr);
        System.out.println();
        SelectionSort(arr);
        DisplayArr(arr);

    }
}
