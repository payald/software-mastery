#include <iostream>
#include <memory>
#include "Adapter.h"
#include "AbstractPlug.h"
using namespace std;

int main()
{
    cout << "Hello world!" << endl;
    //Target = Adapter
    unique_ptr<AbstractPlug> plug = make_unique<Adapter>(USA);
    plug->RoundPin();
    plug->PinCount();
    return 0;
}
