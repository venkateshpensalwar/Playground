//In the University examinations conducted during the past 5 years, the toppers registration numbers were 7126, 82417914, 7687 and 6657.
//Your father is an expert in data mining and he could easily infer a pattern in the toppers registration numbers.
//In all the registration numbers listed here, the sum of the odd digits is equal to the sum of the even digits in the number.
//He termed the numbers that satisfy this property as Probable Topper Numbers.
//Now, write a program to find whether a given number is a probable topper number or not.

// 234 127 678


#include<iostream>
using namespace std;
int main()
{
    int num;
    cin>>num;
    int even_sum=0;
    int odd_sum=0;
    int k;
while(num)
{
k=num%10;
if(k%2==0)
{
    even_sum+=k;
}
else
{
    odd_sum+=k;
}
num=num/10;
}
if(even_sum!=odd_sum)
{
    cout<<"No";
}
else
{
    cout<<"Yes";
}
    return 0;
}
