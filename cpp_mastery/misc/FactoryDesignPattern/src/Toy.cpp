#include <iostream>
#include "Toy.h"
using namespace std;
Toy::Toy(std::string nm,float pr)
{
    //ctor
    cout<<"\n creating toy\n";
    name=nm;
    price=pr;
}

Toy::~Toy()
{
    //dtor
    cout<<"\n destroying toy\n";
}

void Toy::createToy(){
    cout<<"\n created toy "<<name<<" with price "<<price<<endl;
}

void Toy::showToy(){
    cout<<"\n Toy "<<name<<" with price "<<price<<endl;
}
