#include <iostream>

using namespace std;

//Smart Pointers are pointers which get deallocated when the object is deleted
//Example is lock_guard
template<class T>
class SmartPointers{
    T *p;
public:
    explicit SmartPointers(T *ptr=NULL){
        cout<<"\ncreating\n";
        p=ptr;
    }

    ~SmartPointers(){
        cout<<"\ndeleting\n";
        delete p;
    }

    int& operator*(){return *p;}

};

int main()
{
    cout << "Hello world!" << endl;

    SmartPointers<int> ptr(new int(23));

    cout<<endl<<(*ptr);

    return 0;
}
