public class binary_search {
    
    int binarysearch (int[] arr, int tar){

        int st = 0;
        int end = arr.length-1;

        while (st <= end) {
            
        
            int mid =  st + (end - st)/2;

            if(tar == arr[mid]){
                return arr[mid];
            }else if (tar > arr[mid]) {
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public void main(String[] args){
        int arr[] = {2, 5, 8, 12, 16, 20};
        int tar = 16;
        System.out.print(binarysearch(arr,tar));

    }
}
