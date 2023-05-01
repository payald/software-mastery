#ifndef DATASENDER_H
#define DATASENDER_H

enum DataSenderType{
    wired,wireless
};
template <class T>
class DataSender
{
    public:
        DataSender();
        virtual ~DataSender();
        void sendData(T data);

    protected:
        virtual void connect()=0;
        virtual void send(T data)=0;
        virtual void disconnect()=0;

    private:
};

#endif // DATASENDER_H
