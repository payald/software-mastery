#include <iostream>
#include <list>

using namespace std;

class UserDefinedClassList{
    string data;
    int num;
public:
    UserDefinedClassList(string data,int num){
        this->data=data;
        this->num=num;
    }

    string getData(){return data;}
    int getNumber(){return num;}
    friend ostream& operator << (ostream& os, const UserDefinedClassList& obj)
    {
        os << obj.num <<" " << obj.data << endl;
        return os ;
    }
};

bool compareLists(UserDefinedClassList *first,UserDefinedClassList *second){
    return (first->getNumber()<second->getNumber());
}

int main()
{
    cout << "Hello world!" << endl;
    list<UserDefinedClassList*> clist;
    clist.push_back(new UserDefinedClassList("abc",123));
    clist.push_back(new UserDefinedClassList("bc",23));
    clist.push_back(new UserDefinedClassList("c",3));

    list<UserDefinedClassList*>::iterator it;

    for (it=clist.begin();it!=clist.end();it++){
        cout<<endl<<((*it)->getData())<<" "<<((*it)->getNumber())<<endl;
    }
    cout<<"----------------------------------------------------\n";
    clist.sort(compareLists);
    for(auto entry:clist){
        cout<<*entry<<endl;
    }
    return 0;
}
