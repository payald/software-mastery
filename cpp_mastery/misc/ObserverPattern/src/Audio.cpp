#include <iostream>
#include "Audio.h"
using namespace std;
Audio::Audio()
{
    //ctor
    __class__=__func__;
    cout<<"\n audio created\n";
}

Audio::~Audio()
{
    //dtor
    cout<<"\n audio destroyed\n";
}

void Audio::update(const string &message){
    cout<<"\n "<<__class__<<"::"<<message<<endl;
}
