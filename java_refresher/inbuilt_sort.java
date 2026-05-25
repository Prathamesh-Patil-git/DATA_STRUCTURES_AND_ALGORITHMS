import java.util.*;

public class inbuilt_sort {
    

    public static void DisplayArr(int arr[]){

        for(int val : arr){
            System.out.print(val+ " ");
        }
    }

    public static void main(String[] args) {
     
        int arr[] = {9,8,6,5,4};
        DisplayArr(arr);
        System.out.println();
        Arrays.sort(arr); //inbuilt sort
        DisplayArr(arr);

    }
}
