#include <iostream>
#include <set>

using namespace std;


//check if duplicates and remove them

bool isDupPresent(int *arr, int n, set<int> &newArray){
    bool foundDup = false;
    for(int i=0;i<n;i++){
        auto result=newArray.insert(arr[i]);
        if (!result.second){
            foundDup=true;
        }
    }
    return foundDup;
}


int main()
{
    cout << "Hello world!" << endl;
    int arr[]={2,4,2,3,5,7,1,2};
    set<int> newArray;
    int sz = sizeof(arr)/sizeof(arr[0]);
    cout<<"\n original array \n";
    for(auto entry:arr){
        cout<<entry<<" ";
    }
    if (isDupPresent(arr,sz,newArray)){
        cout<<"\n duplicates present and have been removed\n";
        cout<<"{";
        for (auto entry:newArray){
            cout<<entry<<" ";
        }
        cout<<"}";
    }else{
        cout<<"\n no duplicates present\n";
    }

    return 0;
}
