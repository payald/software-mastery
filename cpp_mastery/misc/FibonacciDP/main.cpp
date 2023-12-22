#include <iostream>
#include <map>

using namespace std;

//Fibonacci using dynamic programming memoization
class FibonacciDP{
public:
    static int printFibonacciSeries(const int& num, map<int,int> &cache){

        if (num==1){
            return 1;
        }
        if (num==2){
            return 1;
        }

        if (cache.count(num)>0){
            return cache[num];
        }
        int result = printFibonacciSeries(num-1,cache)+printFibonacciSeries(num-2,cache);
        cout<<result<<" "<<endl;
        cache[num]=result;
        return result;
    }
};

int main()
{
    cout << "Hello world!" << endl;
    int num=6;
    map<int,int> cache;
    FibonacciDP::printFibonacciSeries(num,cache);

    return 0;
}
