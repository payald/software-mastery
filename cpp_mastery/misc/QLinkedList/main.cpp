#include <iostream>

using namespace std;

class Node{
public:
    int data;
    Node* next;
    Node* prev;
    Node(int datum):data(datum){
        prev=next=nullptr;
    }
};

class Queue{
    Node *frnt;
    Node *rear;
public:
    Queue(){
        frnt=rear=nullptr;
    }
    //Add to the rear of the queue
    void add(int datum){
        Node *node=new Node(datum);
        if (frnt==nullptr){
            frnt=rear=node;
        }else{
            rear->prev=node;
            node->next=rear;
            rear=node;
        }
    }
    //Check if q is empty
    bool isEmpty(){
        return (frnt==nullptr);
    }
    //Remove from the front of the queue
    int remove(){
        int value=0;
        if (frnt==nullptr){
            throw ("Q is empty");
        }else{
            value=frnt->data;
            Node *tmp=frnt;
            frnt=frnt->prev;
            frnt->next=nullptr;
            if (frnt==nullptr){
                rear=nullptr;
            }
            delete tmp;
        }
        return value;
    }
    //display the q
    void displayQ(){

        Node *tmp=frnt;
        cout<<endl;
        while(tmp!=nullptr){
            cout<<" "<<tmp->data;
            tmp=tmp->prev;
        }
    }
};

int main()
{
    cout << "Hello world!" << endl;
    Queue q;

    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.displayQ();
    cout<<"removed "<<q.remove()<<endl;
    q.displayQ();
    return 0;
}
