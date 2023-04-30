#ifndef IOBSERVER_H
#define IOBSERVER_H
#include <string>

class IObserver
{
    public:
        IObserver();
        virtual ~IObserver();
        virtual void update(const std::string &message)=0;

    protected:

    private:
};

#endif // IOBSERVER_H
