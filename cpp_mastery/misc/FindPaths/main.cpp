#include <iostream>
#include <vector>

using namespace std;

class Matrix{

    static void printPath(vector<int> path){
        cout<<endl;
        for(int point:path){
            cout<<point<<" ";
        }
        cout<<endl;
    }
    public:
    static void findPaths(vector<vector<int>> &matrix, vector<int> &path,int rowSize, int colSize,int row, int col){
        if (row==rowSize-1 && col==colSize-1){
            path.push_back(matrix[row][col]);
            printPath(path);
            path.pop_back();
            return;
        }
        if (row>=rowSize || row<0 || col>=colSize || col<0){
            return;
        }
        path.push_back(matrix[row][col]);
        if (row+1<rowSize){
            findPaths(matrix,path,rowSize, colSize,row+1,col);
        }
        if (col+1<colSize){
            findPaths(matrix,path,rowSize, colSize,row,col+1);
        }
        path.pop_back();
    }
};

int main()
{
    cout << "Hello world!" << endl;

    vector<vector<int>> matrix={{1,2,3},{4,5,6},{7,8,9}};

    int rowSize=matrix.size();
    int colSize=matrix[0].size();

    vector<int> path;

    Matrix::findPaths(matrix, path, rowSize, colSize,0,0);

    return 0;
}
