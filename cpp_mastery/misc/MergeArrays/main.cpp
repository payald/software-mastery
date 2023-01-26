#include <iostream>
#include <bits/stdc++.h>

using namespace std;

class Arrays{
public:
    int* merge(int arr1[], int arr1size, int arr2[], int arr2size);
};
int* Arrays::merge(int arr1[], int arr1size, int arr2[], int arr2size){

    int* mergedArr = new int[arr1size+arr2size];

    sort(arr1,arr1+arr1size);
    sort(arr2,arr2+arr2size);

    int idx1=0,idx2=0,idx=0;

    while(idx1<arr1size && idx2<arr2size){
        if (arr1[idx1]<arr2[idx2]){
            mergedArr[idx++]=arr1[idx1++];
        }else{
            mergedArr[idx++]=arr2[idx2++];
        }
    }

    while(idx1<arr1size){
        mergedArr[idx++]=arr1[idx1++];
    }

    while(idx2<arr2size){
        mergedArr[idx++]=arr1[idx2++];
    }

    return mergedArr;
}

int main()
{
    cout << "Merge two arrays in sorted manner!" << endl;

    int arr1[]={1,9,5,8,4};
    int arr2[]={7,6,3,2};

    int arr1size = sizeof(arr1)/sizeof(arr1[0]);
    int arr2size = sizeof(arr2)/sizeof(arr2[0]);

    Arrays *arr=new Arrays();

    int* mergedArray = arr->merge(arr1,arr1size,arr2,arr2size);

    cout<<endl;
    for (int i=0;i<arr1size+arr2size;i++){
        cout<<mergedArray[i]<<" ";
    }

    delete[] mergedArray;

    delete arr;

    return 0;
}
