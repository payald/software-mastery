#include <iostream>
#include "DataSender.h"
using namespace std;
template <class T>
DataSender<T>::DataSender()
{
    //ctor
    cout<<"\n DataSender created\n";
}

template <class T>
DataSender<T>::~DataSender()
{
    //dtor
    cout<<"\n DataSender destroyed\n";
}
template <class T>
void DataSender<T>::sendData(T data){
    //Sequence of api execution is very important here
    connect();
    send(data);
    disconnect();
}
