#include <iostream>
#include <stack>

using namespace std;

class Solution {
public:
    bool isValid(string s) {
        stack<char> stk;
        for(int i=0;i<s.length();i++){
            if (s[i]=='(' || s[i]=='{' || s[i]=='['){
                stk.push(s[i]);
            }else if (!stk.empty()){
                if ((s[i]==')' && stk.top()=='(') || (s[i]=='}' && stk.top()=='{') || (s[i]==']' && stk.top()=='[')){
                stk.pop();
                }else if ((s[i]==')' && stk.top()!='(') || (s[i]=='}' && stk.top()!='{') || (s[i]==']' && stk.top()!='[')){
                return false;
                }
            }else if (stk.empty() && (s[i]==']' || s[i]=='}' || s[i]==')')){
                    return false;

            }
        }

        return stk.empty();
    }
};

int main()
{
    cout << "Valid Parenthesis!" << endl;
    string str("(){}");
    Solution sol;
    cout<<str<<" Valid : "<<(sol.isValid(str)?"true":"false")<<endl;
    string str1("(");
    cout<<str1<<" Valid : "<<(sol.isValid(str1)?"true":"false")<<endl;
    string str2("]");
    cout<<str2<<" Valid : "<<(sol.isValid(str2)?"true":"false")<<endl;
    return 0;
}
