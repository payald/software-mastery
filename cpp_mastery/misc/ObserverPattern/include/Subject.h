#ifndef SUBJECT_H
#define SUBJECT_H
#include <iostream>
#include <memory>
#include <list>
#include "IObserver.h"

const int BATTERY_THRESHOLD = 30;

class Subject
{
    public:
        Subject();
        virtual ~Subject();
        void regObserver(std::shared_ptr<IObserver> observer);
        void unregObserver(std::shared_ptr<IObserver> observer);
        void batteryLevel(int val);

    protected:

    private:
        std::list<std::shared_ptr<IObserver>> observerList;

        void notifyAll();
};

#endif // SUBJECT_H
