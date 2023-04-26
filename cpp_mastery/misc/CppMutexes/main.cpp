#include <iostream>
#include <mutex>
#include <thread>

using namespace std;

mutex m;
int balance=0;
void addMoney(int money, string threadID){
    cout<<"\n before update balance = "<<balance<<" and thread ID = "<<threadID<<endl;
    m.lock();
    balance+=money;
    m.unlock();
    cout<<"\n before after balance = "<<balance<<" and thread ID = "<<threadID<<endl;
}

int main()
{
    cout << "Hello world!" << endl;
    cout<<"\n balance = "<<balance<<endl;
    thread t1(addMoney,100,"1");
    thread t2(addMoney,200,"2");
    cout<<"\n balance = "<<balance<<endl;
    t1.join();
    t2.join();
    cout<<"\n balance = "<<balance<<endl;
    return 0;
}
