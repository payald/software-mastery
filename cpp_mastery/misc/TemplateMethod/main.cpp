#include <iostream>
#include <memory>
#include "DataSender.h"
#include "../src/DataSender.cpp"
#include "FDP.h"
using namespace std;

//Template pattern with factory design pattern and templates
int main()
{
    cout << "Hello world!" << endl;
    unique_ptr<FDP> factory = make_unique<FDP>();
    shared_ptr<DataSender<string>> dataSender = factory->createDataSender(wired);
    dataSender->sendData("Sending data via wired");

    dataSender = factory->createDataSender(wireless);
    dataSender->sendData("Sending data via wireless");
    return 0;
}
