#include <iostream>

using namespace std;

int find_string(string infStr, string toFind)
{
	//complete the function!
	for(int index=0;index<infStr.length()-toFind.length();index++){
		bool found=true;
		for(int idx=0;idx<toFind.length() && found;idx++){
			if (infStr[index+idx]!=toFind[idx]){
				found=false;
				index+=idx;
			}
		}
		if (found){
			return 1;
		}
	}
	return 0;
}

int main()
{
    cout << "Hello world!" << endl;
    cout<<find_string("abce","abcd");
    return 0;
}
