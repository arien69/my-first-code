import java.util.Scanner;

public class streakCheck{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int lenArr = in.nextInt();
		int[] array = new int[lenArr];
		for(int i=0; i<lenArr; i++){
			array[i] = in.nextInt();
		}
		int count = 1;
		
		for(int i=0;  i<lenArr; i++){
			for(int j=1; j < lenArr; j++){
			
			if(array[i] < array[j]){
				count++;
				break;
			}
			}
	}
	System.out.print(count);
}}