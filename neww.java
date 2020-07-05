

import java.util.Scanner;

public class neww {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int water = 400;
    int milk = 540;
    int cBeans = 120;
    int cups = 9;
    int money = 550;
	String input;
		
		do{
			System.out.println("Write action (buy, fill, take, remaining, exit): ");
			input = in.next();
			switch(input){
				case "buy":
					System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
					String choice = in.next();
						if (choice != "back"){
							switch(choice){
								case "1":
								if(water >= 250 && cBeans >=16){
									water -= 250;
									cBeans -= 16;
									money += 4;
								}else if( water <250){
									System.out.println("Sorry, not enough water!");
								}else if(cBeans < 16){
									System.out.println("Sorry, not enough coffee beans");
								}
								break;
								case "2":
									if(water >= 350 && milk >= 75 && cBeans >= 20){
										water -= 350;
										milk -= 75;
										cBeans -= 20;
										money += 7;
									}else if(water < 350){
										System.out.println("Sorry, not enough water!");
										
										
									}else if(milk < 75){
										System.out.println("Sorry, not enough milk!");
									}else if (cBeans < 20){
										System.out.println("Sorry, not enough coffee beans!");
									}
									break;
								case "3":
									if(water >=200 && milk >= 100 && cBeans >= 12){
										water -= 200;
										milk -= 100;
										cBeans -= 12;
										money += 6;
									}else if (water < 200){
										System.out.println("Sorry, not enough water!");
									}else if(milk < 100){
										System.out.println("Sorry, not enough milk!");
									}else if (cBeans < 12){
										System.out.println("Sorry, not enough coffee beans!");
									}
									break;
						
							
							}

						}
			
				break;	
				case "fill":
				System.out.println("Write how many ml of water do you want to add:");
					int waterAdd = in.nextInt();
					water += waterAdd;
				System.out.println("Write how many ml of milk do you want to add:");
					int milkAdd = in.nextInt();
					milk += milkAdd;
				System.out.println("Write how many grams of coffee beans do you want to add:");
					int beansAdd = in.nextInt();
					cBeans += beansAdd;
				System.out.println("Write how many disposable cups of coffee do you want to add:");
					int cupsAdd = in.nextInt();
					cups += cupsAdd;
				break;
				
				case "take":
				System.out.println("I gave you $" + money);
				money -= money;
				break;
				
				case "remaining":
				System.out.println("The coffe machine has: ");
				System.out.println(water + " of water");
				System.out.println(milk + " of milk");
				System.out.println(cBeans + " of coffee beans");
				System.out.println(cups + " of disposable cups");
				System.out.println(money + " of money");
				break;
				

		}


    
	}while(!input.equals("exit"));
}
}