#include <iostream>
#include "FDP.h"
#include "Car.h"
using namespace std;
FDP::FDP()
{
    //ctor
    cout<<"\n creating factory design pattern object\n";
}

FDP::~FDP()
{
    //dtor
    cout<<"\n destroying factory design pattern object\n";
}

Toy* FDP::createToy(toyType type){
    Toy *toy=nullptr;
    switch(type){
    case CarType:
        toy=new Car("Nano",100000);

        break;

    }
    return toy;
}
