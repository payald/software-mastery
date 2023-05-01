#include <iostream>
#include "WirelessDataSender.h"
#include "DataSender.h"
using namespace std;

template <class T>
WirelessDataSender<T>::WirelessDataSender():DataSender<T>()
{
    //ctor
    cout<<"\n WirelessDataSender created\n";
}
template <class T>
WirelessDataSender<T>::~WirelessDataSender()
{
    //dtor
    cout<<"\n WirelessDataSender destroyed\n";
}
template <class T>
void WirelessDataSender<T>::connect(){
    cout<<"\n WirelessDataSender::connect \n";
}

template <class T>
void WirelessDataSender<T>::send(T data){
    cout<<"\n WirelessDataSender::send "<<data<<endl;
}

template <class T>
void WirelessDataSender<T>::disconnect(){
    cout<<"\n WirelessDataSender::disconnect \n";
}

