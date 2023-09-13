#include <iostream>

using namespace std;


class HelperAPIs{
public:
    static int atoi(char *str);
};

int HelperAPIs::atoi(char *str){

    int result=0;

    for(int i=0;str[i]!='\0';i++){
        if (str[i]>=48 && str[i]<=57){
            result=result*10+(str[i]-'0');
        }
    }
    return result;
}

int main()
{
    cout << "AtoI!" << endl;

    char arr[] = "012349";
    cout<<"\n"<<HelperAPIs::atoi(arr);

    char str[] = "012349abc";
    cout<<"\n"<<HelperAPIs::atoi(str);
    return 0;
}
