#include <iostream>
#include <vector>

using namespace std;

//Print all permutations which do not contain "AB" as a substring

void findPermutations(string str, vector<string> &allPermutations, int left,int right){
    if (left==right){
        if (str.find("AB")==string::npos){
            allPermutations.push_back(str);
        }
        return;
    }
    for(int i=left;i<=right;i++){
            swap(str[left],str[i]);
            findPermutations(str,allPermutations,left+1,right);
            swap(str[left],str[i]);
    }
}

int main()
{
    cout << "Hello world!" << endl;

    string str="ABC";
    vector<string> allPermutations;
    findPermutations(str,allPermutations,0,str.length()-1);
    for(string str:allPermutations){
        cout<<endl<<str;
    }
    return 0;
}
