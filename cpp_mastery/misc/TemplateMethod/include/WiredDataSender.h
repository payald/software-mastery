#ifndef WIREDDATASENDER_H
#define WIREDDATASENDER_H
#include <string>
#include "DataSender.h"
template <class T>
class WiredDataSender: public DataSender<T>
{
    public:
        WiredDataSender();
        virtual ~WiredDataSender();

    protected:
        void connect();
        void send(T data);
        void disconnect();

    private:
        std::string __class__;
};

#endif // WIREDDATASENDER_H
