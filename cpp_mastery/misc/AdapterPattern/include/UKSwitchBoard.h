#ifndef UKSWITCHBOARD_H
#define UKSWITCHBOARD_H

#include <AbstractSwitchBoard.h>

class UKSwitchBoard : public AbstractSwitchBoard
{
    public:
        UKSwitchBoard();
        virtual ~UKSwitchBoard();
        void Pin();
        void PinCount();

    protected:

    private:
        void FlatPin();
};

#endif // UKSWITCHBOARD_H
