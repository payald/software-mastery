#include "SmartPointer.h"

template <class T>
SmartPointer<T>::SmartPointer(T *p)
{
    //ctor
    ptr=p;
}

template <class T>
SmartPointer<T>::~SmartPointer()
{
    //dtor
    delete ptr;
}
