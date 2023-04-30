#include <iostream>
#include "Subject.h"
using namespace std;
Subject::Subject()
{
    //ctor
    cout<<"\n Subject created\n";
}

Subject::~Subject()
{
    //dtor
    cout<<"\n Subject destroyed\n";
}

void Subject::notifyAll(){
    for(auto itr=observerList.begin();itr!=observerList.end();itr++){
        (*itr)->update("LOW POWER");
    }
}

void Subject::regObserver(shared_ptr<IObserver> observer){
    observerList.push_back(observer);
}

void Subject::unregObserver(shared_ptr<IObserver> observer){
    observerList.remove(observer);
}

void Subject::batteryLevel(int val){

    cout<<"\n battery level is "<<val<<endl;
    if (val<BATTERY_THRESHOLD){
        notifyAll();
    }
}
