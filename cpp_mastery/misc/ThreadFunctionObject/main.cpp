#include <iostream>
#include <thread>
using namespace std;

//Note: To compile programs with std::thread support use g++ -std=c++11 -pthread.

void func(int sz){
    for(int i=0;i<sz;i++){
        cout<<"Function pointer as callable "<<i<<endl;
    }
}

class ThreadClass{
    public:
    void operator()(int sz){
        for(int i=0;i<sz;i++){
            cout<<"Function object as callable "<<i<<endl;
        }
    }
};


int main()
{
    cout << "Hello world!" << endl;
    //starts the thread
    thread thrFunctionPointer(func,3);//function pointer as callable
    thread thrFunctionObject(ThreadClass(),4);//function object as callable

    auto lambdaFunc=[](int sz){
        for(int i=0;i<sz;i++){
            cout<<"Lambda Function as a callable "<<i<<endl;
        }
    };

    thread thrLambdaFunc(lambdaFunc,5);
    //waits for threads to finish
    thrFunctionPointer.join();
    thrFunctionObject.join();
    thrLambdaFunc.join();
    return 0;
}
