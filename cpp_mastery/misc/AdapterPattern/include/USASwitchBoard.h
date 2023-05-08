#ifndef USASWITCHBOARD_H
#define USASWITCHBOARD_H

#include <AbstractSwitchBoard.h>


class USASwitchBoard : public AbstractSwitchBoard
{
    public:
        USASwitchBoard();
        virtual ~USASwitchBoard();
        void Pin();
        void PinCount();

    protected:

    private:
        void SquarePin();
};

#endif // USASWITCHBOARD_H
