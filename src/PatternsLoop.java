public class PatternsLoop {
    public static void main(String[] args) {

        for(int i = 1; i<= 4; i++){
            for(int j = 1; j<= 4; j++){
                   if(i==1 | i ==4 | j== 1 | j==4){
                       System.out.print(" * ");
                   }else{
                       System.out.print("   ");
                   }


            }System.out.println();
        }
        int x;
        int y;
        for(x = 1; x<= 4; x++){
            for(y = 1; y<= x; y++){
                  if((x+y)%2 == 0){

                      System.out.print("1 ");
                  }else{
                      System.out.print("0 ");
                  }




            }System.out.println(" ");
        }
        for(int i = 1; i<= 4; i++){
            for(int j = 1; j<= i; j++){

                    System.out.print(i + " ");



            }System.out.println();
        }


    }
}
