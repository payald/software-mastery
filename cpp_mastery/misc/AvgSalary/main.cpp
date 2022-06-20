#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    double average(vector<int>& salary) {
        double sum=0;
        int count=0;
        auto itr=salary.begin();
        auto begin=*itr;
        int max=*itr;
        int min=*itr;

        for(;itr!=salary.end();itr++){
            if (*itr>max){
                max=*itr;
            }
            if(*itr<min){
                min=*itr;
            }
            sum+=(*itr);

        }
        sum-=min+max;
        return (double)(sum/((salary.size())-2));
    }
};

int main()
{
    cout << "Average Salary" << endl;

    Solution sol;
    vector<int> vect={10,30,20,40};

    cout<<(sol.average(vect));

    return 0;
}
