#ifndef FDP_H
#define FDP_H
#include <memory>
#include <string>
#include "DataSender.h"
class FDP
{
    public:
        FDP();
        virtual ~FDP();
        std::shared_ptr<DataSender<std::string>> createDataSender(DataSenderType type);

    protected:

    private:
};

#endif // FDP_H
