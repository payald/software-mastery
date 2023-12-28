#include <iostream>
#include <vector>
#include <map>

using namespace std;

class Matrix{

    public:
    static void countPaths(vector<vector<int>> matrix, int rowSize, int colSize, int row, int col, int &count){
        if (row==rowSize-1 && col==colSize-1){
            count++;
            return;
        }
        if (row>=rowSize || row<0 || col<0 || col>=colSize){
            return;
        }
        if (row+1<rowSize){
            countPaths(matrix,rowSize,colSize,row+1,col,count);
        }
        if (col+1<colSize){
            countPaths(matrix,rowSize,colSize,row,col+1,count);
        }
        /* If diagonal is allowed
        if (col+1<colSize && row+1<rowSize){
            countPaths(matrix,rowSize,colSize,row+1,col+1,count);
        }
        */
    }

    static int countPathsUsingDP(vector<vector<int>> &matrix, map<pair<int,int>,int> &countPathsDP, int rowSize, int colSize, int row, int col){
        if (row==rowSize-1 && col==colSize-1){
            return 1;
        }
        if (row>=rowSize || row<0 || col<0 || col>=colSize){
            return;
        }
        pair<int,int> key=make_pair(row,col);

        if (countPathsDP.count(key)!=0){
            count+=countPathsDP[key];
            return;
        }
        if (row+1<rowSize){
            countPathsUsingDP(matrix,countPathsDP,rowSize,colSize,row+1,col,count);
        }
        countPathsDP[make_pair(row+1,col)]=count;
        if (col+1<colSize){
            countPathsUsingDP(matrix,countPathsDP,rowSize,colSize,row,col+1,count);
        }
        countPathsDP[make_pair(row,col+1)]=count;
        /* If diagonal is allowed
        if (col+1<colSize && row+1<rowSize){
            countPaths(matrix,rowSize,colSize,row+1,col+1,count);
        }
        */
    }

};

int main()
{
    cout << "Hello world!" << endl;

    vector<vector<int>> matrix={{1,2,3},{4,5,6},{7,8,9}};
    map<pair<int,int>,int> countPathsDP;

    int rowSize=matrix.size();
    int colSize=matrix[0].size();

    int count = 0;
    Matrix::countPathsUsingDP(matrix,countPathsDP, rowSize,colSize,0,0,count);
    cout<<"\n the number of paths are "<<count<<endl;
    return 0;
}
