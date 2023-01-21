#include <iostream>
#include <unordered_map>

using namespace std;

//O(n)
int fibonacci(int n, unordered_map<int,int> memoize){
    if (memoize.find(n)==memoize.end()){
        memoize[n]=fibonacci(n-1,memoize)+fibonacci(n-2,memoize);
    }
    return memoize[n];
}

int main()
{
    int n;
    cout << "Which nth fibonacci do you want?" << endl;
    cin>>n;
    unordered_map<int,int> memoize{{1,0},{2,1}};

    cout<<endl<<"Fibonacci is "<<fibonacci(n,memoize);
    return 0;
}
