#include <iostream>
#include "AbstractPlug.h"
using namespace std;
AbstractPlug::AbstractPlug()
{
    //ctor
    cout<<"\n creating AbstractPlug\n";
}

AbstractPlug::~AbstractPlug()
{
    //dtor
    cout<<"\n destroying AbstractPlug\n";
}

void AbstractPlug::RoundPin()
{
    cout<<"\n I am a Round Pin\n";
}

void AbstractPlug::PinCount(){
    cout<<"\n I have 2 pins\n";
}

