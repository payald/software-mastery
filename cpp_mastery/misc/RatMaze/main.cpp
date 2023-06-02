#include <iostream>
#include <vector>

using namespace std;

//Rat maze to track the trace of a rat through a maze to cheese
//Backtracking algo
bool mazeRec(vector<vector<int>> &maze, vector<vector<int>> &solMaze, int i, int j, int rowSize, int colSize){

    if (i==rowSize-1 && j==colSize-1){
        solMaze[i][j]=1;
        return true;
    }
    if (i<rowSize && j<colSize && maze[i][j]==1){
        solMaze[i][j]=1;//trace
        if (mazeRec(maze,solMaze,i+1,j,rowSize,colSize)){
            return true;
        }
        if (mazeRec(maze,solMaze,i,j+1,rowSize,colSize)){
            return true;
        }
        solMaze[i][j]=0;//backtrace
    }
    return false;
}

void printMaze(vector<vector<int>> &maze){
    for(int i=0;i<maze.size();i++){
        cout<<endl;
        for(int j=0;j<maze[i].size();j++){
            cout<<maze[i][j]<<" ";
        }
    }
}

int main()
{
    cout << "Hello world!" << endl;
    vector<vector<int>> maze={{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
    int rowSize=maze.size();
    int colSize=maze[0].size();
    vector<vector<int>> solMaze( rowSize , vector<int> (colSize, 0));
    cout<<"\n Original maze \n";
    printMaze(maze);
    mazeRec(maze,solMaze,0,0,rowSize,colSize);
    cout<<"\n Rat's path in maze \n";
    printMaze(solMaze);
    return 0;
}
