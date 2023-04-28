#ifndef TOY_H
#define TOY_H
#include <string>
//abstract class interface for product which is Toy here
class Toy
{
    public:
        Toy(std::string nm,float pr);
        virtual ~Toy();

        virtual void createToy()=0;
        virtual void showToy()=0;

    protected:

    private:
        std::string name;
        float price;
};

#endif // TOY_H
