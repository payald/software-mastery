#include <iostream>
#include "Adapter.h"
#include "UKSwitchBoard.h"
#include "USASwitchBoard.h"
using namespace std;
Adapter::Adapter(countryName name)
{
    //ctor
    cout<<"\n creating Adapter \n";
    switch(name){
    case USA:
        switchBoard=make_shared<USASwitchBoard>();

        break;
    case UK:
        switchBoard=make_shared<UKSwitchBoard>();
        break;
    }
}

Adapter::~Adapter()
{
    //dtor
    cout<<"\n destroying Adapter \n";
}

void Adapter::RoundPin(){
    switchBoard->Pin();
}

void Adapter::PinCount(){
    switchBoard->PinCount();
}
