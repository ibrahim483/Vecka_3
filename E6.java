/*
The program uses standard input to read
  two integers N and M
and
  N x M integers between 1 and 6.
This is how the output of exercise E1 looks like:
    N was the number of trials and 
    M was the number of dices used in each trial.


The program prints the sum of dices in a trial that occurrs more often
and how often it occurs.

Example:
java E6
5 3
1 2 3
2 3 4
4 3 2
3 4 5
5 6 6
The most frequent sum is 9
It occurrs 2 times.

Example using the output of E1 as standard input:
java E1 1000 3 | java E6
The most frequent sum is 9
It occurrs 128 times.

*/

/*
Your task is to complete the program.

Hint: Use an array where the indices are the possible sums
that can be achieved in a trial.
For example, if the simulation uses 3 dices the sum of the
three dices can be at most 18. For this case the program
can use an array with 19 places so that even place 18 exists.
In each place you can count how many times that value (the place)
occurs in the sequence of trials.

*/


import java.util.Scanner;
public class E6{
  public static void main(String[] args) {

    Scanner data = new Scanner(System.in);

    int trials = data.nextInt();
    int dices = data.nextInt();

    int total = 0;
    int [] fixar = new int[1 + (dices * 6)];
    int length = 0;
    int mass = 0;

    for (int i = 0; i < trials; i++){
      for (int i1 = 0; i1 < dices; i1 ++) {
        total += data.nextInt();
      }
      fixar[total]++;
      total = 0;

    }
    for (int i = 0; i<fixar.length; i++){
      if (fixar[i]> mass){
        length = i;
        mass = fixar[i];
      }
    }
    System.out.println(" The most frequent sum is " + length);
    System.out.println(" It occurs " + mass +  " " + "times ");
  }
}
