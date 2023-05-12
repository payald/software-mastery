#include <iostream>
#include <queue>

using namespace std;

class Node{
public:
    int data;
    Node *left;
    Node *right;
    Node *nextRight;
    Node(int data){
        this->data=data;
        left=right=nextRight=nullptr;
    }
};

class Solution
{
    public:

    static void freeNodes(Node *root){
        if (root!=nullptr){
            freeNodes(root->left);
            freeNodes(root->right);
            delete root;
        }
    }

    //PostOrder traversal
    static void printNodes(Node *root){
        if (root!=nullptr){
            printNodes(root->left);
            cout<<(root->data)<<" ";
            printNodes(root->right);
        }
    }
    //LevelWise traversal
    static void printNodesLevelWise(Node *root){
        Node *curr=root;
        while(curr!=nullptr){
            Node *temp=curr;
            while(temp!=nullptr){
                cout<<(temp->data)<<" ";
                temp=temp->nextRight;
            }
            curr=curr->left;
        }
    }
    //Function to connect nodes at same level.
    static void connect(Node *root)
    {
       // Your Code Here
       Node*curr = root;

       queue<Node*> q1;
       queue<Node*> q2;
       q1.push(root);
       bool isFirst=true;
       while(!q1.empty() || !q2.empty()){
           if (isFirst){
               curr=q1.front();
               q1.pop();
               cout<<"DATA : "<<(curr->data)<<endl;
               if (curr->left!=nullptr){
                       q2.push(curr->left);
                   }
                if (curr->right!=nullptr){
                       q2.push(curr->right);
                }
               if (q1.empty()){
                   isFirst=false;
                   curr->nextRight=nullptr;

               }else{

                    Node *nextRight=q1.front();
                    curr->nextRight=nextRight;
               }
           }else{
               curr=q2.front();
               q2.pop();
               cout<<"DATUM : "<<(curr->data)<<endl;
               if (curr->left!=nullptr){
                       q1.push(curr->left);
                   }
                if (curr->right!=nullptr){
                       q1.push(curr->right);
                }
               if (q2.empty()){
                   isFirst=true;


                    curr->nextRight=nullptr;

               }else{


                    Node *nextRight=q2.front();
                    curr->nextRight=nextRight;
               }
           }
       }
    }

};

int main()
{
    cout << "Hello world!" << endl;

    Node *root=new Node(10);
    root->left=new Node(20);
    root->right=new Node(30);
    root->left->left=new Node(40);
    root->left->right=new Node(50);
    Solution::printNodes(root);
    cout<<endl<<"connecting nodes at same level\n";
    Solution::connect(root);
    cout<<endl;
    Solution::printNodesLevelWise(root);
    Solution::freeNodes(root);
    return 0;
}
