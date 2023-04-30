#ifndef AUDIO_H
#define AUDIO_H

#include <IObserver.h>


class Audio : public IObserver
{
    public:
        Audio();
        virtual ~Audio();
        void update(const std::string &message);

    protected:

    private:
        std::string __class__;
};

#endif // AUDIO_H
