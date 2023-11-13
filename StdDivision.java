import java.util.Scanner;

public class StdDivision {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        Scanner data = new Scanner(System.in);
        double[] list = new double[number];
        double sum = 0.0;

        for (int i = 0; i < number; i++){
            list[i]= data.nextDouble();
            sum += list[i];

        }

        double avg = (sum/number);

        double avriance = 0;

        for ( int i=0 ; i < number ; i++){
            avriance += (list[i]-1)*(list[i]-1);
        }

        avriance /= number;
        System.out.println("The avg is: "+avg);
        System.out.println("StdDivision: " + Math.sqrt(avriance));



    }
}
