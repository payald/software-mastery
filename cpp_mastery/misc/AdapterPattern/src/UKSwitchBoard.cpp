#include <iostream>
#include "UKSwitchBoard.h"
using namespace std;


UKSwitchBoard::UKSwitchBoard()
{
    //ctor
    cout<<"\n creating UKSwitchBoard\n";
}

UKSwitchBoard::~UKSwitchBoard()
{
    //dtor
    cout<<"\n destroying UKSwitchBoard\n";
}

void UKSwitchBoard::FlatPin(){
    cout<<"\n I am a Flat Pin\n";
}

void UKSwitchBoard::Pin()
{
    FlatPin();
}

void UKSwitchBoard::PinCount(){
    cout<<"\n I have 3 pins\n";
}
