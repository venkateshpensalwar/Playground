#include<iostream>
using namespace std;
int main()
{
 int total_student,total_handshake;
  
  //First input corresponds to the total number of students.
  
  cin>>total_student;
//If there are n number of students in the class then find the total number of handshakes made by the students.
  total_handshake=(total_student*total_student-total_student)/2;
   cout<<total_handshake;
}