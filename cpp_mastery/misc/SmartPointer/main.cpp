#include <iostream>
#include <cstring>

using namespace std;

const int sz=100;

//Below design is based on Single responsibility principle
//This class represents the Sample product
class Sample{
    public:
    int data;
    string text;
    Sample(int data,string text){
        this->data=data;
        this->text=text;
    }
    void func(){
        cout<<endl<<data<<" "<<text<<endl;
    }

    void display(){
        cout<<endl<<data*data<<" "<<text<<endl;
    }
};

//This class represents the container which contains an array of Sample products
class Container{
    Sample* arr[sz];
    int lastIndex;

public:
    Container(){
        lastIndex=-1;
        memset(arr,0,sz*sizeof(Sample*));
    }
    void add(int data, string text){
        if (lastIndex<sz){
            arr[++lastIndex]=new Sample(data,text);
        }
    }

    Sample* getData(int index){
        return arr[index];
    }
    int getCount(){
        return lastIndex;
    }
};

//This class is a wrapper around container class to provide the functionality of smart pointer
class SmartPointer{
    Container *cptr;
    int currentIndex;
public:
    SmartPointer(Container *ptr):cptr(ptr),currentIndex(0){
        cout<<"\ncreating\n";
    }

    ~SmartPointer(){
        cout<<"\ndeleting\n";
        delete cptr;
    }

    Sample* operator->(){
        if (currentIndex!=-1){
            return cptr->getData(currentIndex);
        }
        return nullptr;
    }

    void operator++(int n){
        currentIndex++;
    }

    bool isValid(){
        return (currentIndex<cptr->getCount());
    }
};

int main()
{
    cout << "Hello world!" << endl;

    Container *c=new Container();
    c->add(10,"payal");
    c->add(30,"payaldeb");
    c->add(20,"payal deb");

    SmartPointer ptr(c);
    while(ptr.isValid()){
        ptr->func();
        ptr->display();
        ptr++;
    }
    return 0;
}
