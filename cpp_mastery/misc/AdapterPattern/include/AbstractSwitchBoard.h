#ifndef ABSTRACTSWITCHBOARD_H
#define ABSTRACTSWITCHBOARD_H

//Adaptee
class AbstractSwitchBoard
{
    public:
        AbstractSwitchBoard();
        virtual ~AbstractSwitchBoard();
        virtual void Pin()=0;
        virtual void PinCount()=0;

    protected:

    private:
};

#endif // ABSTRACTSWITCHBOARD_H
