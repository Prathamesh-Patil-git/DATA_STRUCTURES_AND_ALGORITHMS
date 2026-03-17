package java_.Divide_and_Conqure;

public class Merge_sort {

    public static void merge( int st , int mid , int end, int arr[] ) {
        

        int temp[] = new int[end - st +1]; //temp array to store sorted parts
        int i = st; // idx for left sorted part
        int j = mid + 1; // idx for right sorted part
        int k = 0; //idx for temp

        while( i <= mid && j <= end ){
            if(arr[i] < arr[j]){
                temp[k] = arr[i++];
            }else{
                temp[k] = arr[j++];
            }
            k++;
        }

        while( i<=mid){
            temp[k++] = arr[i++];
        }

        while ( j <= end) {
            temp[k++] = arr[j++];
        }

        for(k=0, i=st; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }

    }

    public static void merge_sort(int arr[] ,int st, int end ){

        if(st >= end) return;

        int mid = st + (end - st)/2;

        merge_sort(arr, st, mid); // left half
        merge_sort(arr, mid+1, end); //right half

        merge(st, mid , end , arr);
    }
    
    public static void print_arr(int arr[]){

        System.out.print("[ ");

        for( int i : arr){
            System.out.print(i + " ");
        }

        System.out.print("]");
    }
    
    public static void main(String[] args) {
        
        int arr[] = {6,3,9,5,2,8};
        merge_sort(arr, 0, arr.length - 1);
        print_arr(arr);
    }
}
