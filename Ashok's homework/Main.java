#include<iostream>
using namespace std;

int main()
{
    int row,col;
    cin>>row;
    cin>>col;
    int arr[row][col];
    int arr1[row][col];

    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
            cin>>arr[i][j];
    }
      for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
            cin>>arr1[i][j];
    }

  for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
            cout<<arr1[i][j]+arr[i][j]<<" ";
            cout<<endl;
    }



    return 0;
}
