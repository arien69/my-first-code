import java.util.Scanner;

public class CylicArrayShifter{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		 int len = in.nextInt();
		int[] array = new int[len];
		for(int i = 1; i < len; i++){
			array[i] = in.nextInt();
		}
		array[0] = in.nextInt();
		for(int i = 0; i < len; i++){
			System.out.print(array[i]+" ");
		}
		
	
		
	}
}