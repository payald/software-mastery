#ifndef CAR_H
#define CAR_H

#include "Toy.h"
class Car: public Toy
{
    public:
        Car(std::string nm,float pr);
        void createToy();
        void showToy();
        virtual ~Car();

    protected:

    private:
};

#endif // CAR_H
