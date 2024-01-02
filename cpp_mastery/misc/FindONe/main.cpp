#include <iostream>
#include <vector>

using namespace std;

class FindOne{
    public:
    static int findPosOfOne(vector<int> arr){

        int len = arr.size();
        int mid=len/2;
        int low=0,high=len-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if (arr[mid]==1){
                if (mid-1>=0 && arr[mid-1]==1){
                    high=mid-1;

                }else{
                    return mid;
                }
            }else if (mid+1<len){
                low=mid+1;
            }
        }
        return -1;
    }
};

int main()
{
    cout << "Hello world!" << endl;
    //vector<int> arr={0,0,0,0,0,1};
    //vector<int> arr={0, 0, 1, 1, 1, 1};
    vector<int> arr={1, 1, 1, 1, 1, 1};
    cout<<(FindOne::findPosOfOne(arr));
    return 0;
}
