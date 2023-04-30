#include <iostream>
#include <memory>
#include "Subject.h"
#include "Display.h"
#include "Audio.h"
using namespace std;

int main()
{
    cout << "Hello world!" << endl;

    unique_ptr<Subject> subject = make_unique<Subject>();
    shared_ptr<IObserver> display=make_shared<Display>();
    shared_ptr<IObserver> audio=make_shared<Audio>();

    subject->regObserver(display);
    subject->regObserver(audio);

    subject->batteryLevel(50);
    subject->batteryLevel(40);
    subject->batteryLevel(30);
    subject->batteryLevel(20);
    return 0;
}
