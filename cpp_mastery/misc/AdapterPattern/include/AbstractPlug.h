#ifndef ABSTRACTPLUG_H
#define ABSTRACTPLUG_H

// Target
class AbstractPlug
{
    public:
        AbstractPlug();
        virtual ~AbstractPlug();
        virtual void RoundPin();
        virtual void PinCount();

    protected:

    private:

};

#endif // ABSTRACTPLUG_H
