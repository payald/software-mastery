#include <iostream>
#include "WiredDataSender.h"
#include "DataSender.h"
#include "../src/DataSender.cpp"
using namespace std;
template <class T>
WiredDataSender<T>::WiredDataSender():DataSender<T>()
{
    //ctor
    __class__=__func__;
    cout<<"\n "<<__func__<<" created\n";
}
template <class T>
WiredDataSender<T>::~WiredDataSender()
{
    //dtor
    cout<<"\n "<<__func__<<" destroyed\n";
}
template <class T>
void WiredDataSender<T>::connect(){
    cout<<"\n "<<__class__<<"::"<<__func__<<" \n";
}

template <class T>
void WiredDataSender<T>::send(T data){
    cout<<"\n WiredDataSender::send "<<data<<endl;
}
template <class T>
void WiredDataSender<T>::disconnect(){
    cout<<"\n WiredDataSender::disconnect \n";
}
