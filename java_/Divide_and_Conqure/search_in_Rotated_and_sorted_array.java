public class search_in_Rotated_and_sorted_array {
    

    public static int search(int arr[], int st, int end, int tar){

        if(st > end) return -1;

        int mid = st+(end-st)/2;

        //if tar found at mid
        if(arr[mid] == tar) return mid;

        //if in left half is sorted 
        if(arr[st] <= arr[mid]){ 

            //if tar at left half
            if(arr[st]<= tar && tar < arr[mid]){
                return search(arr, st, mid-1, tar);
            }else{
                return search(arr,mid+1, end, tar);
            }
        }else{

            //if tar at right half
            if(arr[mid] < tar && tar <= arr[end]){
                return search(arr, mid+1, end, tar);
            }else{
                return search(arr, st, mid-1, tar);
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {4,5,6,7,0,1,2};
        int tar = 0;
        System.out.print(search(arr, 0, arr.length-1, tar));
    }
}
