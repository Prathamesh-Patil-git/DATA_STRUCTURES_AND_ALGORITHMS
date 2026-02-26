#include<iostream>
using namespace std;

int max_pro(int arr[], int n){
    int max_pro_sub = 0;


    for(int i = 0; i<n;i++){
        for(int j = i ; j<n; j++){

            int mul = 1;
            for(int k =i; k<=j; k++){
                
                mul = arr[k]*mul;
                max_pro_sub = max(max_pro_sub,mul);
            }
        }  
    }
    return max_pro_sub;
    

}

int main(){
    int arr[] = {2,3,4};
    int n = 3;
    cout<<max_pro(arr,n);
    return 0;
}


// #include<iostream> 
// using namespace std;

// int main(){

//     int a = -6;
//     int b = 3;
//     int c = -10;

//     cout<<a*b*c;
//     return 0;
// }