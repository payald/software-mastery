#include <iostream>
#include <vector>
#include <utility>

using namespace std;

class Solution{
public:
    pair<int,int> findFirstLastOccurrence(vector<int>& vect, int target);
};

pair<int,int> Solution::findFirstLastOccurrence(vector<int>& vect, int target){
    int left=0;
    int size= vect.size();
    int right=size-1;
    pair<int,int> firstLast(-1,-1);
    while(left<=right){
        int mid=left+(right-left)/2;
        if (vect[mid]==target){
            if (mid-1>=0 && vect[mid-1]==target){
                firstLast.first=mid-1;
                right=mid-1;
            }else{
                firstLast.first=mid;
                break;
            }
        }else if(vect[mid]>target){
            right=mid-1;
        }else{
            left=mid+1;
        }
    }
    left=0;
    right=size-1;
    while(left<=right){
        int mid=left+(right-left)/2;
        if (vect[mid]==target){
            if (mid+1<size && vect[mid+1]==target){
                firstLast.second=mid+1;
                left=mid+1;
            }else{
                firstLast.second=mid;
                break;
            }
        }else if(vect[mid]>target){
            right=mid-1;
        }else{
            left=mid+1;
        }
    }
    return firstLast;
}

int main()
{
    cout << "Find the first and last occurrence and also the number of duplicates of a certain number!" << endl;
    Solution sol;
    vector<int> vectArray={2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
    pair<int,int> firstLastOccur = sol.findFirstLastOccurrence(vectArray,5);
    cout<<"\n first occurrence : "<<firstLastOccur.first;
    cout<<"\n last occurrence : "<<firstLastOccur.second;
    cout<<"\n total number of duplicates : "<<(firstLastOccur.second-firstLastOccur.first+1);
    return 0;
}
