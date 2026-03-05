
public class check_if_given_array_sorted_or_not {
    
    public static boolean check_array_is_sorted(int arr[], int i){

        if ( i == arr.length-1 ) return true;

        if ( arr[i] > arr[i+1]) return false;

        return check_array_is_sorted(arr, i+1);
    }   

    public static void main(String[] args){

        int arr[] = {1,2,3,9,5};

        System.out.print(check_array_is_sorted(arr,0));

    }
}


// public class check_if_given_array_sorted_or_not {

//     public static boolean isSorted(int arr[], int i){

//         // base case
//         if(i == arr.length - 1){
//             return true;
//         }

//         if(arr[i] > arr[i+1]){
//             return false;
//         }

//         return isSorted(arr, i+1);
//     }

//     public static void main(String[] args) {

//         int arr[] = {1,2,3,4,5};

//         System.out.println(isSorted(arr, 0));
//     }
// }