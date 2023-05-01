#ifndef WIRELESSDATASENDER_H
#define WIRELESSDATASENDER_H

#include "DataSender.h"
template <class T>
class WirelessDataSender:public DataSender<T>
{
    public:
        WirelessDataSender();
        virtual ~WirelessDataSender();

    protected:
        void connect();
        void send(T data);
        void disconnect();

    private:
};

#endif // WIRELESSDATASENDER_H
