#include <iostream>
#include <string>
#include <vector>

using namespace std;

class ValidationHelper{

    static bool isNumber(string str){
        return (str.find_first_not_of("0123456789.")==string::npos);
    }
    static vector<string> getTokens(string str){
        //12.13.14.15
        size_t dot=-1;
        int start=0;
        vector<string> tokens;
        do{
            dot=str.find('.',dot+1);
            string token = str.substr(start,dot-start);//when dot-start is -ve then
            tokens.push_back(token);
            start=dot+1;
        }while(dot!=string::npos);

        return tokens;

    }
    public:
    static bool validateIP(string ip){
        if (ip.empty()){
            return false;
        }
        if (!isNumber(ip)){
            return false;
        }
        vector<string> numbers=getTokens(ip);

        if (numbers.size()!=4){
            return false;
        }
        for(string number:numbers){
            int num=stoi(number);
            if (num<0 || num>256){//IP is between 0 and 256
                return false;
            }
        }
        return true;
    }
};

int main()
{
    cout << "Hello world!" << endl;
    string ip;

    cout<<"\n enter IP address ";
    getline(cin,ip);

    cout<<(ValidationHelper::validateIP(ip)?"Valid IP":"Invalid IP");

    return 0;
}
