public class random_nummbers {
    public static void main (String[] args){
        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n ; i++){
            System.out.print(Math.random() + " ");

        }
        System.out.println();
    }
}
