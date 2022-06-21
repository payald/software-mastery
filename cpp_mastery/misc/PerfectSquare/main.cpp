#include <iostream>

using namespace std;

class Solution {
public:
    bool isPerfectSquare(int num) {
        int left=1;
        int right=num>1?(num/2):1;
        while(left<=right){
            double mid=left+(right-left)/2;
            double square=mid*mid;
            if (square==num){
                return true;
            }else if (square>num){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;
    }
};

int main()
{
    cout << "Valid square!" << endl;
    Solution sol;
    cout<<" Is 1 a square? "<<((sol.isPerfectSquare(1))?"true":"false")<<endl;
    cout<<" Is 8 a square? "<<(sol.isPerfectSquare(8)?"true":"false")<<endl;
    cout<<" Is 9 a square? "<<(sol.isPerfectSquare(9)?"true":"false")<<endl;
    return 0;
}
