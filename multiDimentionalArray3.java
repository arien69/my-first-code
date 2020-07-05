
import java.util.Scanner;

public class multiDimentionalArray3{
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);

        System.out.println("enter the matrix rows");
        int rMatrix = in.nextInt();

        System.out.println("enter the matrix columns");
        int cMatrix = in.nextInt();

        int[][] Matrix = new int[rMatrix][cMatrix];

        System.out.println("enter the matrix nmbers");

        for(int i = 0; i < rMatrix; i++){
            for(int j = 0; j < cMatrix; j++){
                Matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("enter the seats u want");

        int seats = in.nextInt();
        int emptySeats = 0;
        outer:
        for(int i = 0; i < rMatrix; i++){
            emptySeats = 0;
            for(int j = 0; j < cMatrix; j++){
                if(Matrix[i][j] == 0){
                    emptySeats++;
                }else{emptySeats = 0;}
                if(emptySeats == seats){
                    System.out.print(i);
                    break outer;
                }
            }
        }
        if(seats != emptySeats){
            System.out.print(0);
        }


    }


}
