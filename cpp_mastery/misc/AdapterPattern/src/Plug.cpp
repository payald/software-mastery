#include <iostream>
#include "Plug.h"
using namespace std;


Plug::Plug()
{
    //ctor
    cout<<"\n creating Plug\n";
}

Plug::~Plug()
{
    //dtor
    cout<<"\n destroying Plug\n";
}

void Plug::PinCount(){
    cout<<"\n I have 2 pins\n";
}

void Plug::RoundPin(){
    cout<<"\n I am a round pin\n";
}
