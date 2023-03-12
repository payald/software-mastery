#include <iostream>
#include <queue>

using namespace std;


class Node{
public:
    int data;
    Node *left;
    Node *right;
    Node(int data){
        left=right=nullptr;
        this->data=data;
    }

};
class BFSDFS{
public:
    void preOrder(Node *node){
        if (node!=nullptr){
            cout<<node->data<<" ";
            preOrder(node->left);
            preOrder(node->right);
        }
    }
    void bfs(Node *root){
        if (root==nullptr){
            return;
        }
        queue<Node *> q;
        q.push(root);
        while(!q.empty()){
                Node *temp = q.front();
                cout<<temp->data<<" ";
                q.pop();
                if (temp->left!=nullptr){
                    q.push(temp->left);
                }
                if (temp->right!=nullptr){
                    q.push(temp->right);
                }
        }
    }
};

int main()
{
    cout << "Hello world!" << endl;
    BFSDFS *search = new BFSDFS();

    Node *root = new Node(1);
    root->left= new Node(2);
    root->right = new Node(3);
    root->left->left = new Node(4);
    root->right->right = new Node(5);

    cout<<endl;
    search->bfs(root);
    cout<<endl;
    search->preOrder(root);

    delete search;
    return 0;
}
