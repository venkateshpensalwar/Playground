//The rules for generating Collatz sequence are: If n is even: n = n / 2 If n is odd: n = 3n + 1 For example,
//if the starting number is 5 the sequence is: 5 -> 16 -> 8 -> 4 -> 2 -> 1 It has been proved for almost all integers,
//that the repeated application of the above rule will result in a sequence that ends in 1. Now, write a C++ program to generate the Collatz sequence
/*5

16

8

4

2

1

5
*/
#include<iostream>
using namespace std;
int main()
{
    int num,count;
	cin>>num;
    cout<<num<<endl;
  
  
 // As output, print the numbers in the sequence and also print the number of times the rule has to be applied in order to reach 1.
    while(num!=1)
    {
        if(num%2==0)
        {
            num=num/2;
            cout<<num<<endl;
			count++;
        }
        else
        {
            num=3*num+1;
            cout<<num<<endl;
          count++;
        }
    }
cout<<count;
    return 0;
}
