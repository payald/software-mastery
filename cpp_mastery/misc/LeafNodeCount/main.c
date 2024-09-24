#include <stdio.h>
#include <stdlib.h>


struct Node{
    int data;
    struct Node *left;
    struct Node *right;
};

struct Node* newNode(int data){
    struct Node *newNode=(struct Node *)malloc(sizeof(struct Node));
    newNode->left=newNode->right=NULL;
    newNode->data=data;
    return newNode;
}

int getLeafNodeCount(struct Node *node){
    if (node==NULL){
        return 0;
    }
    if (node->left==NULL || node->right==NULL){
        return 1;
    }
    return getLeafNodeCount(node->left)+getLeafNodeCount(node->right);
}
int main()
{
    printf("Hello world!\n");

    struct Node *root=newNode(1);
    root->left        = newNode(2);
    root->right       = newNode(3);
    root->left->left  = newNode(4);
    root->left->right = newNode(5);

    printf("Leaf count of the tree is %d", getLeafNodeCount(root));
    return 0;
}
