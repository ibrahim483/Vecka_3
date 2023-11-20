public class khara {
    public static void main(String[] args) {


        int y = 0;
        int y2 = 0;
        int y3 = 0;
        for(int i = 0; i<10 ; i++) y2++;
        {
            for(int j = 0; j<10;j++){
            y3++;
                for(int x = 0; x<10;x++){
                    y++;
                }
            }
        }

        System.out.println(y +" "+ y2+ " "+ y3);

    }


}
