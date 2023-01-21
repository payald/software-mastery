#include <iostream>
#include <unordered_map>

using namespace std;

int cntPerfectSubString(string str, int k){
    int len = str.length();
    int sum=0;
    for(int i=0;i<len-1;i++){
        for(int j=i+1;j<len;j++){
            unordered_map<char,int> map;
            for(int n=i;n<=j;n++){
                if (map.find(str[n])==map.end()){
                    map[str[n]]=1;
                }else{
                    int cnt=map[str[n]];
                    cnt++;
                    map[str[n]]=cnt;
                }
            }
            bool isPerfectSubstring = true;
            unordered_map<char,int>::iterator itr;
            for(itr=map.begin();itr!=map.end() && isPerfectSubstring;itr++){
                if (itr->second!=k){
                    isPerfectSubstring=false;
                }
            }
            if (isPerfectSubstring){
                sum++;
            }
        }
    }
    return sum;
}

int main()
{
    string str;
    int k;
    cout << "Enter string!" << endl;
    cin>>str;
    cout<<"\n Enter the number of times a number is present in substring!"<<endl;
    cin>>k;

    cout<<endl<<"\nNumber of perfect substrings? "<<(cntPerfectSubString(str,k));
    return 0;
}
