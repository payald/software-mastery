#include <iostream>
#include "FDP.h"
#include "SmartPointer.h"
#include "../src/SmartPointer.cpp" //For templates related code
using namespace std;

//Factory design pattern via SmartPointer
int main()
{
    cout << "Hello world!" << endl;
    toyType type = CarType;
    SmartPointer<FDP> factory(new FDP());
    SmartPointer<Toy> toy(factory->createToy(type));
    toy->createToy();
    toy->showToy();

    return 0;
}
