#ifndef FDP_H
#define FDP_H

#include "Toy.h"
enum toyType{
    CarType,BikeType,TruckType
};

class FDP
{
    public:
        FDP();
        Toy* createToy(toyType type);
        virtual ~FDP();

    protected:

    private:
};

#endif // FDP_H
