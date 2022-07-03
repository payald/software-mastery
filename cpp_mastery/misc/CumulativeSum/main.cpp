#include <iostream>

using namespace std;

//https://www.spoj.com/problems/CSUMQ/

class Solution{
public:
    void cumulativeSum(int arr[],int n, int arra[][2],int q);
};

void Solution::cumulativeSum(int arr[],int n, int arra[][2],int q){
    int prefixes[n];
    //prefix sum
    prefixes[0]=arr[0];
    for(int i=1;i<n;i++){
        prefixes[i]=prefixes[i-1]+arr[i];
    }
    for (int i=0;i<q;i++){
            int right=arra[i][1];
            int left=arra[i][0];
            if (left==0){
                cout<<endl<<(prefixes[right]);
            }else{
                cout<<endl<<(prefixes[right]-prefixes[left-1]);
            }
    }
}
int main()
{
    cout << "Cumulative Sum!" << endl;
    Solution sol;
    int n,q;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];

    }
    cin>>q;
    int arra[q][2];
    for(int i=0;i<q;i++){
        cin>>arra[i][0];
        cin>>arra[i][1];
    }
    sol.cumulativeSum(arr,n,arra,q);

    return 0;
}
