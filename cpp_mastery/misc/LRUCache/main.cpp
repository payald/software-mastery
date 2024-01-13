#include <iostream>
#include <list>
#include <unordered_map>

using namespace std;

class Node{
    public:
    string value;
    int key;
    Node *next;
    Node *prev;
    Node(int key,string value){
        this->key=key;
        this->value=value;
        next=prev=nullptr;
    }
};

class LRUCache{
    Node *qfront;//Queue
    Node *qrear;
    int listSize;
    int capacity;
    unordered_map<int,Node*> cacheMap;

public:
    LRUCache(int size):capacity(size),listSize(0){
        qfront=qrear=nullptr;
    }
    ~LRUCache(){
        Node *temp=qrear;
        while(temp!=nullptr){
            Node* tmp=temp;
            temp=temp->next;
            delete tmp;
        }
        cacheMap.clear();
    }
    void updateQ(Node *node){
        if (qfront==qrear || qrear==node){
                //check if it is the last entry or the only entry in the queue
                return;
            }
            //remove the node from its position
            if (node->prev!=nullptr){
                node->prev->next=node->next;
                if (qfront==node){
                    qfront=node->prev;
                }
            }
            if (node->next!=nullptr){
                node->next->prev=node->prev;
            }
            //move it to head as it is the most recently used node
            node->next=qrear;
            node->prev=nullptr;
            qrear->prev=node;
            qrear=node;
    }
    string get(int key){
        if (cacheMap.find(key)!=cacheMap.end()){
            //entry is already present in cache
            Node *node=cacheMap[key];
            //update the queue for the most recently used node
            updateQ(node);
            return (node->value);
        }
        //entry not in cache
        return string("");

    }
    int put(int key,string value){
        if (capacity==0){
            return -1;
        }
        if (cacheMap.find(key)!=cacheMap.end()){
            //entry is already present in cache
            Node* node=cacheMap[key];
            if ((node->value)!=value){
                node->value=value;
                //update the queue
                updateQ(node);
            }
            return 0;
        }
        Node *node=new Node(key,value);
        if (listSize==capacity){

            //queue is full
            Node* tmp=qfront;

            if (qfront!=qrear){

                qfront=qfront->prev;//remove from front
                qfront->next=nullptr;

            }
            qrear->prev=node;//add at the rear
            node->next=qrear;
            qrear=node;

            cacheMap.erase(tmp->key);
            delete tmp;

        }else{

            if (qfront==qrear && qfront==nullptr){
                //first entry in cache
                qrear=qfront=node;
            }else{
                node->next=qrear;
                qrear->prev=node;//add at the rear
                qrear=node;
            }
            listSize++;
        }
        //insert into the cache map
        cacheMap.insert(pair<int,Node*>(key,node));
    }

    void display(){
        cout<<endl;
        Node *tmp=qrear;
        cout<<endl<<"cache queue"<<endl;
        while(tmp!=nullptr){
            cout<<(tmp->value)<<" ";
            tmp=tmp->next;
        }
        cout<<endl<<"cache map"<<endl;
        for(auto it=cacheMap.begin();it!=cacheMap.end();it++){
            cout<<it->first<<" ";
        }
    }
};

int main()
{
    cout << "Hello world!" << endl;

    LRUCache *cache = new LRUCache(4);
    try{

    cache->put(1,"abc");
    cache->put(2,"bcd");
    cache->put(3,"cde");
    cache->put(4,"def");
    cache->display();
    cache->put(5,"efg");
    cache->put(6,"fgh");
    cache->display();
    cache->put(1,"ooo");
    cache->put(2,"mmm");
    cache->display();
    cout<<endl<<((cache->get(4))==""?"Empty":"Not empty");
    cout<<endl<<cache->get(6);
    cout<<endl<<((cache->get(1))==""?"Empty":"Not empty");
    cache->display();
    }catch(exception &e){
        cout<<"\n caught an exception "<<e.what();
    }
    delete cache;

    return 0;
}
