#include <iostream>
#include "IObserver.h"
using namespace std;
IObserver::IObserver()
{
    //ctor
    cout<<"\n IObserver created\n";
}

IObserver::~IObserver()
{
    //dtor
    cout<<"\n IObserver destroyed\n";
}

void IObserver::update(const string &message){
    cout<<"\n IObserver update "<<message<<endl;
}
