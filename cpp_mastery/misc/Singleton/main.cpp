#include <iostream>
#include <mutex>
#include <thread>

using namespace std;

class Singleton{

    Singleton(){}
    Singleton(const Singleton&){}
    Singleton& operator=(const Singleton&){}
    ~Singleton(){}
    static mutex mutex_;
    static int count;
    public:
    static Singleton& getInstance(){
        lock_guard<mutex> myLock(mutex_);// RAII
        static Singleton instance;
        return instance;
    }
    void display(){
        count++;
        cout<<"\nSingleton"<<count<<endl;
    }

};

mutex Singleton::mutex_;
int Singleton::count=0;

void threadFunc1(){
    Singleton &instance = Singleton::getInstance();
    instance.display();
}

void threadFunc2(){
    Singleton &instance = Singleton::getInstance();
    instance.display();
}

int main()
{
    cout << "Hello world!" << endl;
    thread th1(threadFunc1);
    thread th2(threadFunc2);
    th1.join();
    th2.join();

    return 0;
}
