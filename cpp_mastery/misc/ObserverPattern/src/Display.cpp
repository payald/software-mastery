#include <iostream>
#include "Display.h"

using namespace std;
Display::Display()
{
    //ctor
    __class__=__func__;
    cout<<"\n display created\n";
}

Display::~Display()
{
    //dtor
    cout<<"\n display destroyed\n";
}

void Display::update(const string &message){
    cout<<"\n "<<__class__<<"::"<<message<<endl;
}
