#include <iostream>
#include <bits/stdc++.h>

using namespace std;

//Comparison for descending order
bool cmp(int first, int second){

    return first>second;
}

//the majority element is that which occurs n/2+1 times
int findMajorityElement(int arr[],int length){
    sort(arr,arr+length,cmp);
    int mid=length/2;

    if (arr[mid]==arr[mid+1]){
        return arr[mid];
    }
    return -1;

}

int main()
{
    cout << "Majority Element!" << endl;
    int arr[]={9,2,2,2,9,4,5,6,7,8,9};
    int arr2[]={8,7,3,4,5,5,5,5,5,7,8};
    int length=sizeof(arr)/sizeof(arr[0]);
    int len=sizeof(arr2)/sizeof(arr2[0]);

    cout<<endl<<"majority element in arr is "<<findMajorityElement(arr,length);
    cout<<endl<<"majority element in arr2 is "<<findMajorityElement(arr2,len);
    return 0;
}
