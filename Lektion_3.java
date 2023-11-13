import java.util.Scanner;

public class Lektion_3 {
    public static void main (String [] args){
        Scanner data = new Scanner(System.in);

        int one, two, three, four, five, six;
        one = two = three = four = five = six = 0;

        while (data.hasNext()){
            switch (data.nextInt()){
                case 1: one++;break;
                case 2: two++;break;
                case 3: three++;break;
                case 4: four++;break;
                case 5: five++;break;
                case 6: six++;break;
                default:
                    System.out.println("unexpected value! ");

            }

        }
        System.out.println("1: " + one);
        System.out.println("2: " + two);
        System.out.println("3: " + three);
        System.out.println("4: " + four);
        System.out.println("5: " + five);
        System.out.println("6: " + six);
    }
}
