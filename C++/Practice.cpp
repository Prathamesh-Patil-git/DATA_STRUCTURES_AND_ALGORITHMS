// minnumber
#include<iostream>
using namespace std;

int minnum(int arr[] , int st, int end){

    int minnumber=0;

    if(st == end){
        return minnumber = arr[st];
    }else if(st == end-1){
        if(arr[st]<arr[end]){
            return minnumber = arr[st];
        }else{
            return minnumber = arr[end];
        }
    }

    int mid = st + (end-st)/2;

    int min1 = minnum(arr,st,mid);
    int min2 = minnum(arr,mid+1,end);

    return min(min1,min2);
}

int main(){
    int arr[]={4,6,8,34,100,9,10,15,5,47};
    int end = 9;
    int st=0;

    cout<<minnum(arr,st,end);
    return 0;

}



// maxnumber
// #include<iostream>
// using namespace std;

// int maxnum(int arr[] , int st, int end){

//     int maxnumber=0;

//     if(st == end){
//         return maxnumber = arr[end];
//     }else if(st == end-1){
//         if(arr[st]>arr[end]){
//             return maxnumber = arr[st];
//         }else{
//             return maxnumber = arr[end];
//         }
//     }

//     int mid = st + (end-st)/2;

//     int min1 = maxnum(arr,st,mid);
//     int min2 = maxnum(arr,mid+1,end);

//     return max(min1,min2);
// }

// int main(){
//     int arr[]={4,6,8,34,79,9,10,15,69,47};
//     int end = 9;
//     int st=0;

//     cout<<maxnum(arr,st,end);
//     return 0;

// }


//both
#include<iostream>
using namespace std;

class Node {

private:
    int minnum;
    int maxnum;
    int arr[10]={4,6,8,34,79,9,10,15,69,47};

public: 
    Node(int min,int max){
        minnum=min;
        maxnum=max;
    }
};

class Ans{
    
};

int main(){
    
    return 0;

}