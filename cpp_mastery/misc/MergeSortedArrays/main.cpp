#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int finalItr=m+n-1;
        int itr2=n-1;
        int itr1=m-1;
        while(itr1!=-1 && itr2!=-1){
            if (nums2[itr2]>nums1[itr1]){
                nums1[finalItr--]=nums2[itr2--];
            }else{
                nums1[finalItr--]=nums1[itr1--];
            }
        }
        while(itr2!=-1){
            nums1[finalItr--]=nums2[itr2--];
        }
    }
};

int main()
{
    cout << "Merge sorted arrays" << endl;
    vector<int> nums1={10,20,30,40,50,0,0,0,0,0};
    vector<int> nums2={22,31,45,52,65};
    Solution sol;
    sol.merge(nums1,5,nums2,5);
    auto itr=nums1.begin();
    while(itr!=nums1.end()){
        cout<<*itr<<endl;
        itr++;
    }
    return 0;
}
