#include <iostream>
#include <map>
#include <string>

using namespace std;

class CustomClass{
    int id;
public:
    CustomClass(int id){
        this->id=id;
    }
    int getId()const {
        return id;
    }
};

class CustClass{
    int id;
public:
    CustClass(int id){
        this->id=id;
    }
    int getId()const {
        return id;
    }
    bool operator<(const CustClass &rhs)const
    {
        //It seems that adding operator< in class only works when object is key and not when pointer is key
        return this->id<rhs.getId();
    }
};
//By default std::map (and std::set) use operator< to determine sorting. Therefore, you need to define operator< on your class.
// **const object can call only const member function()**
struct CustomClassCmp {
    bool operator()(const CustomClass* lhs, const CustomClass* rhs) const
    {
        return lhs->getId()<rhs->getId();
    }
};

int main()
{
    cout << "Hello world!" << endl;
    map<CustomClass*,string,CustomClassCmp> customMap;
    CustomClass* cc[]={new CustomClass(4),new CustomClass(2),new CustomClass(3),new CustomClass(1)};
    int size=sizeof(cc)/sizeof(cc[0]);
    string str="-> custom class ";
    for(int i=0;i<size;i++){
        customMap[cc[i]]=str+to_string(cc[i]->getId());
    }
    for (auto itr=customMap.begin();itr!=customMap.end();itr++){
        cout<<itr->first->getId()<<" "<<itr->second<<endl;
    }
    CustomClass* cc5 = new CustomClass(3);
    cout<<((customMap.find(cc5)!=customMap.end())?"Found":"Not found")<<endl;

    CustClass* cc1 = new CustClass(9);
    CustClass* cc2 = new CustClass(10);
    CustClass* cc3 = new CustClass(8);
    //It seems that adding operator< in class only works when object is key and not when pointer is key
    map<CustClass,int> custMap;
    custMap[*cc1]=99;
    custMap[*cc2]=100;
    custMap[*cc3]=88;

    for (auto itr=custMap.begin();itr!=custMap.end();itr++){
        cout<<itr->first.getId()<<"-> "<<itr->second<<endl;
    }

    CustClass* cc4 = new CustClass(8);
    cout<<((custMap.find(*cc4)!=custMap.end())?"Found":"Not found");

    return 0;
}
