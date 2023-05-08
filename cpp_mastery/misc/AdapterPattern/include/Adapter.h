#ifndef ADAPTER_H
#define ADAPTER_H
#include <memory>
#include "AbstractSwitchBoard.h"
#include "AbstractPlug.h"
enum countryName{
    UK,USA
};

//Adapter
class Adapter: public AbstractPlug
{
    public:
        Adapter(countryName name);
        virtual ~Adapter();
        void RoundPin();
        void PinCount();

    protected:

    private:
        std::shared_ptr<AbstractSwitchBoard> switchBoard;
};

#endif // ADAPTER_H
