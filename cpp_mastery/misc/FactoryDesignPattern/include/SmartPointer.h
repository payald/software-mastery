#ifndef SMARTPOINTER_H
#define SMARTPOINTER_H


template <class T>
class SmartPointer
{
    public:
        SmartPointer(T *p=nullptr);
        virtual ~SmartPointer();
        T& operator*(){return *ptr;}
        T* operator->(){return ptr;}

    protected:

    private:
        T *ptr;
};

#endif // SMARTPOINTER_H
