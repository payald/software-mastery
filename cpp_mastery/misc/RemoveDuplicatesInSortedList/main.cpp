#include <iostream>

using namespace std;

struct Node{
    string data;
    Node *next;
    Node(string data){
        this->data=data;
    }
};

class LinkedList{
public:
    static void removeDuplicates(Node *head){
        Node *prev=head;
        if (prev->next==nullptr){
            return;
        }
        Node *curr=head->next;
        while(curr!=nullptr){
                cout<<"\n current = "<<curr->data<<" prev = "<<prev->data<<endl;
            if (curr->data==prev->data){
                Node *temp=curr;
                prev->next=curr->next;
                curr=curr->next;
                delete temp;
            }else{
                prev=curr;
                curr=curr->next;
            }
        }

    }

    static void printNodes(Node *head){
        Node *curr=head;
        cout<<endl;
        while(curr!=nullptr){
            cout<<curr->data<<" ";
            curr=curr->next;
        }
        cout<<endl;
    }

    static void freeNodes(Node **head){
        Node *curr=*head;

        while(curr!=nullptr){
            Node *temp=curr;
            curr=curr->next;
            delete temp;
        }
        *head=nullptr;
    }

};

int main()
{
    cout << "Hello world!" << endl;
    Node *head=new Node("11");
    head->next=new Node("11");
    head->next->next=new Node("11");
    head->next->next->next=new Node("21");
    head->next->next->next->next=new Node("43");
    head->next->next->next->next->next=new Node("43");
    head->next->next->next->next->next->next=new Node("60");

    LinkedList::printNodes(head);
    cout<<"\n removing duplicates\n";
    LinkedList::removeDuplicates(head);

    LinkedList::printNodes(head);
    cout<<"\n freeing nodes\n";
    LinkedList::freeNodes(&head);

    return 0;
}
