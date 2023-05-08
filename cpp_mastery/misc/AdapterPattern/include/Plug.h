#ifndef TARGET_H
#define TARGET_H

#include <AbstractPlug.h>


class Plug : public AbstractPlug
{
    public:
        Plug();
        virtual ~Plug();
        void RoundPin();
        void PinCount();

    protected:

    private:
};

#endif // TARGET_H
