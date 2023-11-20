import java.util.Scanner;
public class Input_scan {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println(" input a line: ");
        String userInput= data.nextLine();

        while (!userInput.equals("!!")){
            System.out.println(" you interd; %s\n "+ userInput);
            userInput = data.nextLine();

        }


    }
}
