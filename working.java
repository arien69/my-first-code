

import java.util.Scanner;

public class working{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
   
    int water = 400;
    int milk = 540;
    int cBeans = 120;
    int cups = 9;
    int money = 550;
    
    do{
		System.out.println("Write action (buy, fill, take, remaining, exit):");
		String entry = in.next();
		if(entry == "exit"){
			break;
		}else if(entry == "remaining"){
			System.out.println("The coffee machine has: ");
			System.out.println(water + "of water");
			System.out.println(milk + "of milk");
			System.out.println(cBeans +"  of coffee beans");
			System.out.println(cups + " of disposable cups");
			System.out.println("$" + money + " of money");
		}else if(entry == "buy"){
			System.out.println
		}
		
	
	
		
	}while();
    
    