#include <iostream>
#include <thread>
#include <chrono>
#include <deque>

using namespace std;

void func1(deque<int> &crew,bool &done){

    for(int i=0;i<crew.size()&& !done;i++){
        cout<<"\n Crew thread "<<crew[i]<<endl;
        std::this_thread::sleep_for(1000ms);
    }
}

void func2(deque<int> &engine,bool &done){

    for(int i=0;i<engine.size()&& !done;i++){
        cout<<"\n Engine thread "<<engine[i]<<endl;
        std::this_thread::sleep_for(1000ms);
    }
}

int main()
{
    cout << "Hello world!" << endl;
    deque<int> crew = {1,2,3,4,5,6,7,8,9,10};
    deque<int> engine = {10,9,8,7,6,5,4,3,2,1};
    bool done=false;
    thread t1(func1,ref(crew),ref(done));
    thread t2(func2,ref(engine),ref(done));
    std::this_thread::sleep_for(8000ms);
    done=true;
    t1.join();
    t2.join();
    return 0;
}
