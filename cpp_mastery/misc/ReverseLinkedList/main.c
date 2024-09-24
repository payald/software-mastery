#include <stdio.h>
#include <stdlib.h>


struct Node {
    int data;
    struct Node *next;
};

void print(struct Node *head){
    struct Node *temp=head;
    while(temp!=NULL){
        printf("%d ",temp->data);
        temp=temp->next;
    }

}

void push(struct Node **head, int data){
    struct Node *newNode=(struct Node *)malloc(sizeof(struct Node));
    newNode->data=data;
    newNode->next=*head;
    *head=newNode;

}

void reverse(struct Node **head){
    struct Node *prev=NULL;
    struct Node *current=*head;
    struct Node *next=NULL;
    while(current!=NULL){
        next=current->next;
        current->next=prev;
        prev=current;
        current=next;
    }
    *head=prev;
}
int main()
{
    printf("Hello world!\n");

    struct Node *head=NULL;
    push(&head,1);
    push(&head,2);
    push(&head,3);
    push(&head,4);
    push(&head,5);
    push(&head,6);

    printf("\n list ");
    print(head);
    reverse(&head);
    printf("\n reversed list ");
    print(head);
    return 0;
}
