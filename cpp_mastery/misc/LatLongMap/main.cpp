#include <iostream>
#include <map>


using namespace std;

//Latitude and longitude of places

void print(const map<pair<int,int>,string> &places){
    cout<<"{";
    for(const auto &itr:places){
        cout<<itr.first.first<<","<< itr.first.second<<"->"<<itr.second<<" ";
    }
    cout<<"}";
}

int main()
{
    cout << "Hello world!" << endl;

    map<pair<int,int>,string> places;
    pair<pair<int,int>,string> place;
    int temp=1;
    string name;

    while(temp>0){
        cout<<"\n enter latitude ";
        cin>>temp;
        place.first.first=temp;

        if (temp>0){
            cout<<"\n enter longitude ";
            cin>>temp;
            place.first.second=temp;

            cout<<"\n enter name \n";
            name="";
            while (name.length() == 0)
            getline(cin,name);
                place.second=name;

            places.insert(place);
        }
    }


    print(places);

    int lat,longitude;
    cout<<"\nenter latitude and longitude to be deleted ";

    cin>>lat>>longitude;

    auto itr = places.find(make_pair(lat,longitude));

    if (itr!=places.end()){
        places.erase(itr);
    }else{
        cout<<"\n not found\n";
    }

    print(places);


    return 0;
}
