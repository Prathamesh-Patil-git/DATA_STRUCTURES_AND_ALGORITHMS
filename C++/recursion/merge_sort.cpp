#include <iostream>
using namespace std;


void printarray(int arr[]){
    for(int i =0; i<7;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

void merge(int arr[] , int st, int mid, int end){

    int temp[7]={};

    int i = st;
    int j = end;
    int k = 0;

    while (i <= mid && j <=end){

        if(arr[i] < arr[j]){
            temp[k] = arr[i++];
        }else{
            temp[k] = arr[j++];
        }
        k++;
    }

    while(i<=mid){
        temp[k++] = arr[i++];
    }

    while(j<=end){
        temp[k++]=arr[j++];
    }


    for( k = 0, i = st; k<7; k++){
        arr[st++] = temp[k];
    }
}

void merge_sort(int arr[], int st, int end){

    if(st>=end) return;

    int mid = st + (end-st)/2;

    merge_sort(arr, st, mid); //left side
    merge_sort(arr,mid+1, end); //right side

    merge(arr, st, mid, end);
}

int main(){
    int arr[] = {6,3,4,9,1,0,5};
    merge_sort(arr,0,7);

    printarray(arr);
    return 0;
}