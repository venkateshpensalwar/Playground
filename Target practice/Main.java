//Drona normally trains his disciples using a board which consists of concentric circles.
//When a student correctly hits the center of the concentric circles, his score is 100.
//The score gets reduced depending on where the students hit on the board.
//When the student hits outside the board, his score is 0.
//Drona will not allow a student to have his food unless he scores 100.
//Arjuna will always hit the target in his first attempt and he will leave early.
// Others may take more turns to reach a score of 100.
// Now, write a program to determine the number of turns a disciple takes to reach the target score of 'n'.

#include<iostream>
using namespace std;
int main()
{
  int target_score,score,sum;
  sum=0;
  int turns=0;

  cin>>target_score;
  while(sum<target_score)
  {
      cin>>score;
      sum+=score;
      turns++;
  }

  cout<<"The number of turns is "<<turns;
  
  return 0;
}