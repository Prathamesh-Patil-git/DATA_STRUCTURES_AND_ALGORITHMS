
public class Quick_sort {

    public static void printarr(int arr[]){

        System.out.print("[ ");
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.print("]");
    }

    public static int partition (int arr[], int st, int end){
        
        int pivot = arr[end];
        int i = st-1; //to make place for  elements smaller than pivot

        for(int j = st; j<end;j++){
            
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void quick_sort( int arr[] , int st, int end){
        if(st >= end ){
            return;
        }

        int pivotindex = partition(arr, st, end);
       quick_sort(arr,st,pivotindex-1); //left
       quick_sort(arr,pivotindex+1,end); //right

    }

    public static void main(String[] args){

        int arr[] = {6,3,9,5,2,8};
        quick_sort(arr, 0, arr.length-1);
        printarr(arr);
    }
}