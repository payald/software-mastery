#include <iostream>

using namespace std;

// Reference - https://isocpp.org/wiki/faq/newbie#const-vs-define
// Reference -
// https://github.com/isocpp/CppCoreGuidelines/blob/master/CppCoreGuidelines.md#es31-dont-use-macros-for-constants-or-functions
// Reference - https://isocpp.org/wiki/faq/templates#nondependent-name-lookup-members

const int MAX_CAPACITY = 2;

//abstract class List with pure virtual functions
template<class T>
class List{
protected:
    int length;//length and capacity are members of abstract class to understand how it works
    int capacity;//they can be made members of derived class as well like arr
public:
    List(){
        capacity=MAX_CAPACITY;
        length=0;
    }
    List(int capacity){
        this->capacity=capacity;
        length=0;
    }
    virtual bool isEmpty();//Implementation in derived is not reqd as implementation is provided in base
    virtual bool add(T entry)=0;//Implementation is red in base class
    virtual void clear();
    virtual T remove(int index)=0;
    virtual int size();
    virtual void print()=0;
    virtual ~List()=0;//pure virtual destructor
};

//ArrayList class which implements List class
template<class T>
class ArrayList:public List<T>{
    T* arr;
public:
    ArrayList():List<T>(){
        arr=new T[MAX_CAPACITY];
    }
    ArrayList(int capacity);
    bool add(T entry);
    T remove(int index);
    void print();
    void resize();
    ~ArrayList();
};

//Increase the array list capacity twice
template<class T>
void ArrayList<T>::resize(){
    this->capacity*=2;
    T* temparr=new T[this->capacity];

    for(int index=0;index<this->length;index++){
        temparr[index]=arr[index];
    }

    delete[] arr;
    arr=temparr;
}

//Pure virtual destructor for List
template<class T>
List<T>::~List(){
    capacity=length=0;
}

//Destructor for ArrayList
template<class T>
ArrayList<T>::~ArrayList(){
    delete[] arr;
}

//Clear the list
template<class T>
void List<T>::clear(){
    length=0;
}

//Parameterized constructor for ArrayList
template<class T>
ArrayList<T>::ArrayList(int capacity):List<T>(capacity){
    arr=new T[MAX_CAPACITY];
}

//check if list is empty
template<class T>
bool List<T>::isEmpty(){
    return (length==0);
}

//Print the array list
//TODO::Add an iterator
template<class T>
void ArrayList<T>::print(){
    cout<<endl;
    for(int index=0;index<this->length;index++){
        //length is not accessed directly but as this->length as it is nondependent name, see Reference
        cout<<arr[index]<<" ";
    }
}

//Append an entry to the array list
template<class T>
bool ArrayList<T>::add(T entry){
    if (this->length>=this->capacity){
        resize();
    }
    arr[this->length++]=entry;

    return true;
}

//Remove the entry at a particular index
template<class T>
T ArrayList<T>::remove(int index){
    T temp;
    if (this->length==0){
        cout<<"ArrayList is empty";
        return INT_MIN;
    }else{
        temp=arr[index];
        for(int idx=index;idx<this->length-1;idx++){
            arr[index]=arr[index+1];
        }
        this->length--;
    }
    return temp;
}

//Return the number of entries in the array list
template<class T>
int List<T>::size(){
    return length;
}


int main()
{
    cout << "ArrayList!" << endl;

    List<int> *arrList=new ArrayList<int>();
    arrList->add(1);
    arrList->add(2);
    arrList->add(3);
    arrList->add(4);

    arrList->print();
    arrList->remove(2);
    arrList->print();

    delete arrList;

    return 0;
}
