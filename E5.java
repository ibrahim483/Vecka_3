/*
Above average.
According to the course book, 90% of incoming college students
rate themselves as above average.

This program that takes a command-line argument n,
reads in n integers from standard input,
and prints the fraction of values that are strictly above the average
value.

Example of use including expected output:

java E5 10
1 2 3 4 5 6 7 8 9 10
5 of 10 values were above the average 5.5

*/

/*
Your task is to complete the program under
  // Your code here

The program will need to store the values read from standard input
because it needs to go throught the values again after calculating
the average.
*/

import java.util.Scanner;
public class E5{
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    Scanner data = new Scanner(System.in);
    double[] numbers = new double[n];
    double nextNumber ;
    int countNumbers =0;
    double sum = 0.0;

    for (int i = 0; i < n ; i++) {
      nextNumber = data.nextDouble();
      numbers[i]= nextNumber;
      sum +=nextNumber;

    }

    double avg = sum/n;
    for (int i = 0; i < n ; i++) {
      if (avg < numbers[i]) {
        countNumbers++;
      }
    }

    System.out.println( countNumbers+ " Of "+ n+ " values were above the average "+ avg);
  }
}
