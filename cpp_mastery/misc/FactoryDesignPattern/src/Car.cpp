#include <iostream>
#include "Car.h"
using namespace std;
Car::Car(std::string nm,float pr):Toy(nm,pr)
{
    //ctor
    cout<<"\ncreating car\n";
}

Car::~Car()
{
    //dtor
    cout<<"\n destroying car\n";
}

void Car::createToy(){
    cout<<"\ncreating toy car\n";
    Toy::createToy();
}

void Car::showToy(){
    cout<<"\n showing toy car\n";
    Toy::showToy();
}

