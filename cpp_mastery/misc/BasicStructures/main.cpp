#include <iostream>
#include <string.h>
#include <bits/stdc++.h>
using namespace std;

struct Book{
    int price;
    char name[50];
    Book(){
        price=0;
        memset(name,0,sizeof(name));
    }
    Book(int newPrice,string bookName){
        price=newPrice;
        strcpy(name,bookName.c_str());
    }
}book1;

struct Car{
    int speed;
    int price;
    Car(){
        price=speed=0;
    }
    Car(int newSpeed, int newPrice){
        price=newPrice;
        speed=newSpeed;
    }
}cars[5];

//Function to compare two cars based on speed/price ratio
bool cmp(Car car1, Car car2){
    return (1.0*car1.speed/car1.price) > (1.0*car2.speed/car2.price);
}

int main()
{
    cout << "Basic Structures!" << endl;
    cout<<endl<<"book name and price : "<<book1.name<<" "<<book1.price;
    Book book2;
    book2.price=100;
    strcpy(book2.name,"Buddha");
    cout<<endl<<"book name and price : "<<book2.name<<" "<<book2.price;
    Book book3(1,"Siddhartha");
    cout<<endl<<"book name and price : "<<book3.name<<" "<<book3.price;
    cars[0].speed=10;cars[0].price=10;
    cars[1].speed=11;cars[1].price=9;
    cars[2].speed=9;cars[2].price=10;
    cars[3].speed=8;cars[3].price=11;
    cars[4].speed=12;cars[4].price=10;
    sort(cars,cars+5,cmp);
    for(int index=0;index<5;index++){
        cout<<endl<<cars[index].price<<" "<<cars[index].speed;
    }
    return 0;
}
