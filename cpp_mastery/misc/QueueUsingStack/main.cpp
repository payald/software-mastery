#include <iostream>
#include <stack>
using namespace std;

//Build a queue using two stacks
//Add into the queue in O(1)
//Remove from the queue in O(n)
template <class T>
class Queue{
    stack<T> stackOne;
    stack<T> stackTwo;
public:
    void add(T element);
    T remove();
    void displayQ();
};

template <class T>
void Queue<T>::displayQ(){
    cout<<endl;
    while(!stackTwo.empty()){
        T element=stackTwo.top();
        stackTwo.pop();
        cout<<element<<" ";
    }
    while(!stackOne.empty()){
        T element=stackOne.top();
        stackOne.pop();
        cout<<element<<" ";
    }
}

template <class T>
void Queue<T>::add(T element){
    stackOne.push(element);
}

template <class T>
T Queue<T>::remove(){

    if (stackTwo.empty()){
        if (stackOne.empty()){
            throw std::runtime_error("Queue is empty");
        }
        while(!stackOne.empty()){
            T element=stackOne.top();
            stackOne.pop();
            stackTwo.push(element);
        }
    }
    T element = stackTwo.top();
    stackTwo.pop();
    return element;

}

int main()
{
    cout << "Hello world!" << endl;

    Queue<string> q;
    q.add("abc");
    q.add("abc");
    q.add("efgh");
    q.add("ijkl");
    cout<<"\n popped = "<<q.remove()<<endl;
    q.add("mnop");
    q.displayQ();
    return 0;
}
