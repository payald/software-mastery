#ifndef DISPLAY_H
#define DISPLAY_H
#include <IObserver.h>

class Display:public IObserver
{
    public:
        Display();
        virtual ~Display();
        void update(const std::string &message);

    protected:

    private:
        std::string __class__;
};

#endif // DISPLAY_H
