#include <iostream>
#include <vector>
#include <map>

using namespace std;

class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        map<int,int> hashtable;
        vector<int> intersection;
        int counter1=0;
        int counter2=0;
        int size1=nums1.size();
        int size2=nums2.size();
        while(counter1<size1){
            if (hashtable.find(nums1[counter1])==hashtable.end()){
                hashtable[nums1[counter1]]=1;
            }else{
                int count=hashtable[nums1[counter1]];
                count++;
                hashtable[nums1[counter1]]=count;
            }
            counter1++;
        }

        while(counter2<size2){
            if (hashtable.find(nums2[counter2])!=hashtable.end()){
                int count=hashtable[nums2[counter2]];
                if (count){
                count--;
                hashtable[nums2[counter2]]=count;
                intersection.push_back(nums2[counter2]);
                }
            }
            counter2++;
        }
        return intersection;
    }
};

int main()
{
    cout << "Intersection of two arrays!" << endl;
    vector<int> nums1={1,2,2,1};
    vector<int> nums2={1,1};
    Solution sol;
    vector<int> intersection=sol.intersect(nums1,nums2);
    for(int i=0;i<intersection.size();++i){
        cout<<intersection[i]<<" ";
    }
    cout<<endl;
    return 0;
}
