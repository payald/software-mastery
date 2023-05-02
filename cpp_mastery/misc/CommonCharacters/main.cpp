#include <iostream>
#include <map>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

const int MAX_CHAR_CNT=26;

//Find common characters between two strings in O(n) with O(n) space
map<char,int> findCommonCharacters(string &str1,string &str2){
    map<char,int> bitMap;
    int len1=str1.length();
    int len2=str2.length();
    vector<int> bitMap1(MAX_CHAR_CNT,0);
    for (int i=0;i<len1;i++){
        int ch = str1[i]-'a';
        bitMap1[ch]++;
    }
    vector<int> bitMap2(MAX_CHAR_CNT,0);
    for (int i=0;i<len2;i++){
        int ch = str2[i]-'a';
        bitMap2[ch]++;
    }

    int i=0;
    while(i<MAX_CHAR_CNT){
        int cnt=min(bitMap1[i],bitMap2[i]);
        if (cnt!=0){
            bitMap['a'+i]=cnt;
        }
        i++;
    }

    return bitMap;
}
void insertIntoBitMap(map<char,int> &bitMap, char str){
            if (bitMap.find(str)==bitMap.end()){
                bitMap[str]=1;
            }else{
                bitMap[str]++;
            }
}
//Find common characters in one string in O(nlogn)
map<char,int> findCommonChars(string &str2){
    sort(str2.begin(),str2.end());
    int len2=str2.length();

    map<char,int> bitMap;
    int i=0;
    for(;i<len2;i++){
        insertIntoBitMap(bitMap,(char)str2[i]);
    }

    return bitMap;
}

int main()
{
    cout << "Hello world!" << endl;
    string str1="abca";
    string str2="abcdab";
    map<char,int> commonChars = findCommonCharacters(str1,str2);

    for(auto itr=commonChars.begin();itr!=commonChars.end();itr++){
        cout<<itr->first<<" "<<itr->second<<endl;
    }
    cout<<endl<<"---------------------------------\n";
    map<char,int> commonCharacters = findCommonChars(str2);

    for(auto itr=commonCharacters.begin();itr!=commonCharacters.end();itr++){
            if ((itr->second)!=1){
                cout<<itr->first<<" "<<itr->second<<endl;
            }
    }
    return 0;
}
