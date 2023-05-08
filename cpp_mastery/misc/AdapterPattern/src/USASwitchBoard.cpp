#include <iostream>
#include "USASwitchBoard.h"
using namespace std;


USASwitchBoard::USASwitchBoard()
{
    //ctor
    cout<<"\n creating USASwitchBoard\n";
}

USASwitchBoard::~USASwitchBoard()
{
    //dtor
    cout<<"\n destroying USASwitchBoard\n";
}

void USASwitchBoard::SquarePin()
{
    cout<<"\n I am a Square Pin\n";
}

void USASwitchBoard::Pin(){
    SquarePin();
}

void USASwitchBoard::PinCount(){
    cout<<"\n I have 5 pins\n";
}
