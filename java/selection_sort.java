public class selection_sort {

    public static void selection(int []arr){

        for(int i = 0; i<arr.length-1;i++){
            int min=i;
            for(int j = i+1 ; j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }

    public static void display(int []arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String []args){
        int []arr = {2,9,4,6,3,8,1,7,5};
        selection(arr);
        display(arr);
    }
}
