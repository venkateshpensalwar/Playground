#include<iostream>
using namespace std;

int main()
{
    int num,marks,pass;
    cin>>num;
    int score[num];

    for(int i=0;i<num;i++)
    {
        cin>>score[i];
    }

cin>>marks;

    for(int i=0;i<num;i++)
    {
        if(score[i]==marks)
            {
                pass=1;
                    break;
            }
}


    if(pass==1)
    {
        cout<<"She passed her exam";
    }
    else
    {
        cout<<"She failed";
    }

    return 0;
}


