public class Enhance2DArray {
    public static void main(String[] args) {
        int a=5, b=6, c=7, d=8;
        int x[] = {5,6,7,8};
        int y[] = {5,3,7,8};
        int z[] = {5,6,2,8};
        int p[][] = {
                {5, 6, 7, 8},
                {5, 3, 7, 8},
                {5, 6, 2, 8}
        };
        for(int i[]: p){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
