#include <iostream>
#include <thread>
#include <mutex>
#include <condition_variable>
#include <deque>
using namespace std;

mutex mu;
condition_variable cond;
deque<int> buffer;
const int maxBufferSize=50;


void producer(int val){

    while(val){
        unique_lock<mutex> lock(mu);
        cond.wait(lock,[]{return buffer.size()<maxBufferSize;});
        cout<<"\n Produced = "<<val<<endl;
        buffer.push_back(val);
        val--;
        cond.notify_one();
    }
}

void consumer(){

    while(true){
        unique_lock<mutex> lock(mu);
        cond.wait(lock,[](){return buffer.size()>0;});
        cout<<"\n Consumed = "<<buffer.back()<<endl;
        buffer.pop_back();
        cond.notify_one();
    }
}

int main()
{
    cout << "Hello world!" << endl;
    thread t1(consumer);
    thread t2(producer,100);
    t1.join();
    t2.join();
    return 0;
}
