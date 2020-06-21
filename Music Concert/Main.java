#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
 int *ticket_numbers;
  int no_tickets,male,female;
  cin>>no_tickets;
  ticket_numbers=(int *)malloc(no_tickets*sizeof(int));

    for(int i=0;i<no_tickets;i++)
    {
      cin>>*(ticket_numbers+i);
      if((*(ticket_numbers+i))%2==0)
      {
        female++;
      }
      else
      {
        male++;
      }
    }
  cout<<male<<"\n"<<female;
  return 0;
}