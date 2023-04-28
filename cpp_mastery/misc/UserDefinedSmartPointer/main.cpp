#include <iostream>

using namespace std;

class Draw{
    int height,width;
public:
    Draw(int h,int w):height(h),width(w){
        cout<<"\n creating draw object\n";
    }
    void display(){
        cout<<"\n Drawing "<<height<<" "<<width<<endl;
    }
    ~Draw(){
        cout<<"\n deleting draw object\n";
    }
    int getHeight(){return height;}
    int getWidth(){return width;}
};

//Overloaded operator<< for printing Draw object
ostream& operator<<(ostream &s, Draw &draw) {
    return s << "(" << draw.getHeight() << ", " << draw.getWidth() << ")"<<endl;
}
//Smart Pointers help in automatic deallocation when pointer goes out of scope
template <class T>
class SmartPointer{
    T *ptr;
public:
    explicit SmartPointer(T *p=nullptr):ptr(p){}
    ~SmartPointer(){delete ptr;}
    T& operator*(){return *ptr;}
    T* operator->(){return ptr;}
};

int main()
{
    cout << "Hello world!" << endl;
    SmartPointer<Draw> ptr(new Draw(10,20));
    ptr->display();
    cout<<(*ptr);
    return 0;
}
