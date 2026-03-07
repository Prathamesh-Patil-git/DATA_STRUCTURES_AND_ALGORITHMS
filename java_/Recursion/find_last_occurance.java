public class find_last_occurance {
    
    public static int last_occurance(int arr[] , int key , int i){

        if(i == arr.length){
            return -1;
        }

        int isfound = last_occurance(arr, key, i+1);

        if(isfound != -1){
            return isfound;
        }

        if(arr[i] == key){
            return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,3,5};
        int key =  3; 
        
        System.out.print(last_occurance(arr, key, 0));
    }
}
