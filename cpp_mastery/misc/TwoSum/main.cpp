#include <iostream>
#include<vector>
#include<algorithm>

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> output,temp(nums);

        sort(temp.begin(),temp.end(),greater<int>());

        int begin=0,count=0;

        int end=nums.size()-1;

        int num1,num2;

        while(begin<end) {
            int sum=temp[begin]+temp[end];
            if (sum==target){
                num1=temp[begin];
                num2=temp[end];
                break;
            }else if(sum>target){
                begin++;
            }else{
                end--;
            }
        }

        for(int i=0;i<nums.size();i++){
            if (nums[i]==num1 || nums[i]==num2){
                output.push_back(i);
                count++;
                if (count==2){
                    break;
                }
            }


        }
        return output;
    }

    void print(vector<int>& nums){
        cout<<endl;
        for(auto i=nums.begin();i!=nums.end();i++){
            cout<<*i<<" ";
        }
        cout<<"\n";
    }
};

int main()
{
    cout << "Sum of two numbers in a vector is equal to a given number!" << endl;
    Solution sol;

    vector<int> vect{1,2,5,3,4,8};
    vector<int> newvect{3,2,3};


    vector<int> output=sol.twoSum(vect,9);
    sol.print(output);

    output=sol.twoSum(newvect,6);
    sol.print(output);

    newvect.clear();

    newvect.push_back(3);
    newvect.push_back(3);

    output=sol.twoSum(newvect,6);
    sol.print(output);

    return 0;
}
