#include <iostream>
#include <queue>
using namespace std;

template <class T>
class Stack{
    queue<T> q1;
    queue<T> q2;
public:
    void pop();
    void push(T data);
    void displayStack();
    bool isEmpty();
    T top();
    void pushData(queue<T> &toQ, queue<T> &fromQ);
};
template <class T>
void Stack<T>::pushData(queue<T> &toQ, queue<T> &fromQ){
    while(!fromQ.empty()){
                T data=fromQ.front();
                fromQ.pop();
                if (!fromQ.empty()){
                    toQ.push(data);
                }
            }
}

//During pop(), all but the last element is moved to the other queue
template <class T>
void Stack<T>::pop(){
    if (q1.empty()){
        pushData(q1,q2);
    }else{
        pushData(q2,q1);
    }

}

template <class T>
T Stack<T>::top(){
    if (q1.empty()){
        return q2.back();
    }
    if (q2.empty()){
        return q1.back();
    }
    throw std::runtime_error("stack is empty");

}

template <class T>
bool Stack<T>::isEmpty(){
    return (q1.empty() && q2.empty());
}

//During push(), push into the non-empty queue
template <class T>
void Stack<T>::push(T data){
        if (q1.empty()){
            q2.push(data);
        }else{
            q1.push(data);
        }

}
template <class T>
void Stack<T>::displayStack(){
    cout<<endl<<"Stack :: ";
    while(!isEmpty()){
        try{
            cout<<top()<<" ";
            pop();
        }catch(exception &e){
            cout<<endl<<e.what()<<endl;
            break;
        }
    }
}

int main()
{
    cout << "Hello world!" << endl;
    Stack<string> stk;
    stk.push("abc");
    stk.push("abc");
    stk.pop();
    stk.push("def");
    stk.push("ghi");
    stk.push("klm");
    stk.displayStack();
    return 0;
}
