#include <iostream>

using namespace std;

class Solution {
public:
    int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        while(n){
            int digit = n%10;
            product*=digit;
            sum+=digit;
            n=n/10;
        }
        return (product-sum);

    }
};

int main()
{
    cout << "Difference of product and sum" << endl;
    Solution sol;
    cout<<(sol.subtractProductAndSum(29));

    return 0;
}
