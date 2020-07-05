import java.util.Scanner;

public class maxTax{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int nComp = in.nextInt();
		int[] income = new int[nComp];
		int[] percen = new int[nComp];
		
		for (int i = 0; i < nComp; i++){
			income[i] = in.nextInt();
		}
		for (int i = 0; i < nComp; i++){
			percen[i] = in.nextInt();
		}
		int[] tax = new int[nComp];
		for(int i=0; i<nComp; i++){
			tax[i] = income[i] * percen[i];
		}
		int maxTax = tax[0];
		int j = 0;
		for(int i = 0; i < nComp; i++){
			if(tax[i] > maxTax){
			j = i;
			}
		}
		System.out.print(j+1);
	
	
	}
}