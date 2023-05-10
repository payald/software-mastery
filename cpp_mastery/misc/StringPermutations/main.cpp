#include <iostream>
#include <utility>
#include <vector>
#include <algorithm>
#include <string.h>

using namespace std;

class Permutation{
public:
    static void permutate(char *str, int l,int r,vector<string> &ans){
        if (l==r){
            cout<<endl<<str<<endl;
            string charArr = str;
            ans.push_back(charArr);//used string instead of char* as the value changes back in char*
        }else{
            for (int i=l;i<=r;i++){
                swap(str[l],str[i]);
                permutate(str,l+1,r,ans);
                swap(str[l],str[i]);//revert the swap while backtracking
            }
    }
    }
};

int main()
{
    cout << "Hello world!" << endl;
    string str="ABC";

    int len = str.length();

    char *charstr=new char[len+1];

    strcpy(charstr,str.c_str());

    vector<string> ans;

    Permutation::permutate(charstr,0,len-1,ans);

    //print in lexicographically order
    cout<<"\n sorted order\n";

    sort(ans.begin(),ans.end());

    for(long long unsigned int i=0;i<ans.size();i++){
        cout<<ans[i]<<endl;
    }

    delete []charstr;

    return 0;
}
