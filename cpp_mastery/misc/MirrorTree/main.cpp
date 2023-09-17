#include <iostream>
#include <deque>

using namespace std;

const int DELIMITER=-999;

class Node{
public:
    int data;
    Node *left;
    Node *right;
    Node(int datum):data(datum){
        left=right=nullptr;
    }
};

class Tree{
public:
    static void deleteTree(Node *root){
        if (root!=nullptr){
            deleteTree(root->left);
            deleteTree(root->right);
            delete root;
        }
    }
    static void printRecTree(Node *root){
        if (root!=nullptr){
            cout<<" "<<root->data;
            printRecTree(root->left);
            printRecTree(root->right);

        }
    }
    //Creating a new mirror tree
    //The approach is top down
    static Node* getMirrorTree(Node *root){
        if (root!=nullptr){
            Node *newNode=new Node(root->data);
            newNode->left=getMirrorTree(root->right);
            newNode->right=getMirrorTree(root->left);
            return newNode;
        }
        return root;
    }
    //Converting to a mirror tree
    //The approach is bottom up
    static void convertToMirrorTree(Node *root){
        if (root!=nullptr){
            convertToMirrorTree(root->right);
            convertToMirrorTree(root->left);
            Node *temp=root->left;
            root->left=root->right;
            root->right=temp;
        }
    }
    //Printing tree level wise
    static void printTree(Node *root){
        deque<Node*> q;
        if (root==nullptr){
            return;
        }
        q.push_back(root);
        Node *node=new Node(DELIMITER);
        q.push_back(node);
        while(!(q.empty())){
            Node *tmp=q.front();
            q.pop_front();
            if (tmp->data==DELIMITER){
                delete tmp;
                Node *nodum=new Node(DELIMITER);
                cout<<endl;
                if (q.empty()){
                    break;
                }
                q.push_back(nodum);
            }else{
                cout<<" "<<tmp->data;
            }

            if (tmp->left!=nullptr){
                q.push_back(tmp->left);
            }
            if (tmp->right!=nullptr){
                q.push_back(tmp->right);
            }
        }
    }
};

int main()
{
    cout << "Hello world!" << endl;
    Node *root=new Node(1);
    root->left=new Node(2);
    root->right=new Node(3);
    root->left->left=new Node(4);
    root->left->right=new Node(5);
    root->right->left=new Node(6);
    root->right->right=new Node(7);

    Tree::printRecTree(root);
    Node *mirror=Tree::getMirrorTree(root);
    cout<<endl;
    Tree::printRecTree(mirror);
    Tree::convertToMirrorTree(root);
    cout<<endl;
    Tree::printRecTree(root);
    cout<<endl;
    Tree::printTree(root);
    Tree::deleteTree(root);
    return 0;
}
