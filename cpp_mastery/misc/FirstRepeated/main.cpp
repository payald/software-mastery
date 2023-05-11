#include <iostream>
#include <set>
#include <map>

using namespace std;

class Solution {
  public:
    // Function to return the position of the first repeating element.
    static int firstRepeatedInList(int arr[], int n) {
        // code here
        struct cmp {
            bool operator() (pair<int,int> a, pair<int,int> b) const {
                return (a.first<b.first);
            }
        };
        set<pair<int,int>,cmp> numSet;

        for(int i=0;i<n;i++){
            auto itr = numSet.find(pair<int,int>(arr[i],i+1));
            if (itr!=numSet.end()){
                pair<int,int> p=*itr;
                return p.second;
            }else{
                numSet.insert(pair<int,int>(arr[i],i+1));
            }
        }
        return -1;
    }
    static int firstRepeated(int arr[], int n) {
        // code here
        map<int,int> numMap;

        for(int i=0;i<n;i++){
            auto itr = numMap.find(arr[i]);
            if (itr==numMap.end()){
                numMap[arr[i]]=1;
            }else{
                int cnt=numMap[arr[i]];
                cnt++;
                numMap[arr[i]]=cnt;
            }
        }

        for(int i=0;i<n;i++){
            if (numMap.find(arr[i])!=numMap.end()){
                if (numMap[arr[i]]>1){
                    return i+1;
                }
            }
        }
        return -1;
    }
};

int main()
{
    cout << "Hello world!" << endl;

    int arr[]={1, 5, 3, 4, 3, 5, 6};
    int sz=sizeof(arr)/sizeof(arr[0]);

    for(int num:arr){
        cout<<num<<" ";
    }
    cout<<"\n First element in list which has duplicate";
    int pos=Solution::firstRepeated(arr,sz);
    cout<<endl<<arr[pos-1]<<" at position "<<pos<<endl;
    cout<<"\n First element in list which is repeated";
    pos=Solution::firstRepeatedInList(arr,sz);
    cout<<endl<<arr[pos-1]<<" at position "<<pos<<endl;
    return 0;
}
