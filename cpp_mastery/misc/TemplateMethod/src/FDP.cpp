#include <iostream>
#include <memory>
#include "FDP.h"
#include "DataSender.h"
#include "WiredDataSender.h"
#include "WirelessDataSender.h"
#include "../src/WiredDataSender.cpp"
#include "../src/WirelessDataSender.cpp"
using namespace std;
FDP::FDP()
{
    //ctor
    cout<<"\n Factory design pattern created\n";
}

FDP::~FDP()
{
    //dtor
    cout<<"\n Factory design pattern destroyed\n";
}

shared_ptr<DataSender<string>> FDP::createDataSender(DataSenderType type){
    shared_ptr<DataSender<string>> dataSender = nullptr;
    switch(type){
    case wired:
        dataSender = make_shared<WiredDataSender<string>>();
        break;
    case wireless:
        dataSender = make_shared<WirelessDataSender<string>>();
        break;
    }
    return dataSender;
}
