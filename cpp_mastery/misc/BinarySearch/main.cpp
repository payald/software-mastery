#include <iostream>

using namespace std;

class BinarySearch{

    public:
    BinarySearch(){}
    bool find(int arr[],int length, int num);
    bool recursiveFind(int arr[],int left, int right, int num);
};
/**
 * Search in nlogn complexity in a sorted array
 **/
bool BinarySearch::find(int arr[],int length,int num){
    int left=0,right=length-1,mid;

    while(left<=right){
        mid =left+(right-left)/2;
        if (arr[mid]==num){
            return true;
        }else if (arr[mid]>num){
            right=mid-1;
        }else{
            left=mid+1;
        }
    }
    return false;
}
/**
 * Binary Search using recursion
 **/
bool BinarySearch::recursiveFind(int arr[],int left, int right,int num){
    int mid = left + (right-left)/2;
    if (left>right){
        return false;
    }else if (arr[mid]==num){
        return true;
    }else if (arr[mid]>num){
        return recursiveFind(arr, left, mid-1,num);
    }else if (arr[mid]<num){
        return recursiveFind(arr, mid+1, right, num);
    }
}

int main()
{
    cout << "Binary Search!" << endl;
    int arr[]={1,2,3,4,5,6,7,8,9};
    int length = sizeof(arr)/sizeof(arr[0]);

    BinarySearch bSearch;
    cout<<endl<<(bSearch.find(arr,length,4)?"found 4":"not found 4");
    cout<<endl<<(bSearch.recursiveFind(arr,0,length-1,8)?"found 8 recursively":"not found 8 recursively");
    cout<<endl<<(bSearch.recursiveFind(arr,0,length-1,10)?"found 10 recursively":"not found 10 recursively");
    return 0;
}

