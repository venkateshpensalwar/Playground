#include<iostream>
using namespace std;


int main()
{
    int num;
    int MAX=0;
    cin>>num;
    int arr[num];

    for(int i=0;i<num;i++)
    {
        cin>>arr[i];
    }
    MAX=arr[0];

    for(int i=1;i<num;i++)
    {
        if(arr[i]>MAX)
        {
            MAX=arr[i];
        }
      
    }

  cout<<MAX;
}
