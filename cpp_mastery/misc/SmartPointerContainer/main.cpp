#include <iostream>

using namespace std;

//Implement a smart pointer around a container
//Smart pointer and Container separated as part of Single Responsibility design principle
const std::runtime_error nullPointer("Pointer is null");
class Node{
    public:
    int data;
    Node *next,*prev;
    Node(int datum):data(datum),next(nullptr),prev(nullptr){}
};
class Container{
    Node *head,*current,*tail;
    int count;
public:
    Container():head(nullptr),current(nullptr),tail(nullptr){}
    int getCount(){
        return count;
    }
    void add(int data){
        Node *node=new Node(data);
        if (head==nullptr){
            tail=current=head=node;
        }else{
            tail->next=node;
            node->prev=tail;
            tail=node;
        }
        count++;
    }
    void next(){
        if (current->next!=nullptr){
            current=current->next;
        }
    }

    int getCurrentData(){
        if (current==nullptr){
            throw nullPointer;
        }else{
            return current->data;
        }
    }

};

class SmartPointerContainer{
    Container *cptr;
public:
    SmartPointerContainer(Container *cptr){
        cout<<"\ncreating\n";
        this->cptr=cptr;
    }

    ~SmartPointerContainer(){
        cout<<"\ndeleting\n";
        delete cptr;
    }

    void operator++(int n){
        cptr->next();
    }

    int operator*(){
        return cptr->getCurrentData();
    }

};

int main()
{
    cout << "Hello world!" << endl;
    try {
        Container *c=new Container();
        c->add(10);
        c->add(20);
        c->add(30);
        c->add(40);
        SmartPointerContainer spc(c);
        for(int i=0;i<c->getCount();i++){
            cout<<*spc<<endl;
            spc++;
        }
        Container *container=new Container();
        SmartPointerContainer smartpc(container);
        cout<<*smartpc<<endl;//throws exception
    }catch (std::exception& e){
        std::cerr << "exception: " << e.what() << std::endl; }
    return 0;
}
