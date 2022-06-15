#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        sort(nums.begin(),nums.end(),greater<int>());
        int size=nums.size();
        for (int idx=0;idx<size-1;idx++){
            if (nums[idx]==nums[idx+1]){
                return true;
            }
        }
        return false;
    }
};

int main()
{
    cout << "Contains duplicate!" << endl;
    vector<int> vec={2,5,1,6,9,4,1};
    Solution sol;
    cout<<(sol.containsDuplicate(vec)?"contains duplicate":"does not contain duplicate")<<endl;
    return 0;
}
