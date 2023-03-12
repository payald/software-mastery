#include <iostream>

using namespace std;
//Given an array of numbers, find number of sub-arrays that begin with 3 and end with 6.
//Arista Networks
class SubArrays{
    public:
    void findSubArrays(int *arr, int len, int startsWith, int endWidth){
        int count=0;
        cout<<endl;
        for(int i=0;i<len-1;i++){
            for(int k=i;k<len-1;k++){
                for(int j=k+1;k<len;k++){
                    if (arr[k]==3 && arr[j]==6){
                        cout<<arr[k]<<" "<<arr[j]<<endl;
                        count++;
                    }
                }
            }
        }
        cout<<"\n Number of subarrays that begin with 3 and end with 6 :: "<<count;
    }
};

int main()
{
    cout << "Hello world!" << endl;

    int arr[]={1,2,3,4,5,6,3,4,6,3,3,6};

    int len=sizeof(arr)/sizeof(arr[0]);

    SubArrays *sub = new SubArrays();
    sub->findSubArrays(arr, len, 3, 6);
    return 0;
}
