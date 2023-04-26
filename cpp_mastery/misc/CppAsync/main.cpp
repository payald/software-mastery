#include <iostream>
#include <future>


using namespace std;

typedef long long int ull;

//Task helps in returning the value to main function
ull findOdd(ull start,ull ending){
    cout<<"\n Task Thread ID "<<this_thread::get_id()<<endl;
    ull oddSum = 0;
    for (ull i=start;i<ending;i++){
        if (i&1){
            oddSum+=i;
        }
    }
    return oddSum;
}

int main()
{
    cout << "Hello world!" << endl;
    ull start=0,ending=1900000000;
    cout<<"\nThread created if policy is launch::async\n";
    cout<<"\n Thread ID "<<this_thread::get_id()<<endl;
    //The thread id will be same in case of launch::deferred as new thread is not getting created
    //The thread id will be same in case of launch::async as new thread is getting created
    future<ull> oddSum=async(launch::deferred,findOdd,start,ending);
    cout<<"\nWaiting for the result\n";
    cout<<"\nOddSum = "<<oddSum.get()<<endl;
    cout<<"\nCompleted\n";
    return 0;
}
