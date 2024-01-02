#include <iostream>

using namespace std;

class Node{
public:
    int data;
    Node *left;
    Node *right;
    Node(int datum):data(datum){
        left=right=nullptr;
    }
};

class BST{

public:
    static Node* insertIntoBST(Node *root,int data){
        if (root==nullptr){
            Node *temp=new Node(data);
            return temp;
        }
        if (root->data>data){
            root->left=insertIntoBST(root->left,data);
        }else{
            root->right=insertIntoBST(root->right,data);
        }
        return root;
    }
    static void inorder(Node *root){
        if (root!=nullptr){
            inorder(root->left);
            cout<<root->data<<" ";
            inorder(root->right);
        }
    }

    static Node* getInorderSuccessor(Node *root, Node *parent, int data){
        if (root==nullptr){
            return root;
        }
        if (root->data==data){
            if (root->right!=nullptr){
                Node *temp=root->right;
                while(temp->left!=nullptr){
                    temp=temp->left;
                }
                return temp;
            }else{
                return parent;
            }
        }else{
            Node *ret= getInorderSuccessor(root->left,root,data);
            if (ret!=nullptr){
                return getInorderSuccessor(root->left,root,data);
            }else{
                return ret;
            }

        }
    }

    static void freeNodes(Node *root){
        if (root!=nullptr){
            freeNodes(root->left);
            freeNodes(root->right);
            delete root;
        }
    }

};

int main()
{
    cout << "Hello world!" << endl;
    Node *root=nullptr;

    root=BST::insertIntoBST(root,9);
    root=BST::insertIntoBST(root,2);
    root=BST::insertIntoBST(root,4);
    root=BST::insertIntoBST(root,6);
    root=BST::insertIntoBST(root,5);
    root=BST::insertIntoBST(root,7);
    root=BST::insertIntoBST(root,3);
    root=BST::insertIntoBST(root,8);

    BST::inorder(root);
    Node *successor=BST::getInorderSuccessor(root,nullptr,2);
    if (successor){
        cout<<" "<<successor->data;
    }else{
        cout<<"Not found";
    }
    cout<<endl<<(successor==nullptr?-1:successor->data);
    BST::freeNodes(root);
    return 0;
}
