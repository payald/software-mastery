#include <iostream>

using namespace std;

int main()
{
    cout << "Matrix!" << endl;

    int **arr=new int* [3];
    for(int i=0;i<3;i++){
        arr[i]=new int [3];
    }

    int sum=0;
    for (int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            arr[i][j]=sum++;
        }
    }

    for(int i=0;i<3;i++){
        cout<<endl;
        for(int j=0;j<3;j++){
            cout<<arr[i][j]<<" ";
        }
    }

    for(int i=0;i<3;i++){
        delete[] arr[i];
    }
    delete[] arr;
    return 0;
}
