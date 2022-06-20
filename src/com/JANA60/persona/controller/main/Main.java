package com.JANA60.persona.controller.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Person p1, p2;
		String repeat="", answer="";
		Scanner keyboard= new Scanner (System.in);
		do
		{
			
			System.out.println("Welcome");
			System.out.println("Please insert the name of Person 1:");
			
			String name1= keyboard.nextLine();
			
			System.out.println("Please insert the surname of Person 1:");
			String surname1= keyboard.nextLine();
			
			System.out.println("Please insert the city where Person 1 lives:");
			String city1= keyboard.nextLine();

			System.out.println("Please insert the street where Person 1 lives:");
			String street1= keyboard.nextLine();
			
			System.out.println("Please insert the city where Person 1 lives:");
			int num1= Integer.parseInt(keyboard.nextLine());
			
			Address address1 = new  Address (street1, num1, city1);
			
			p1= new Person (name1, surname1, address1);

			System.out.println("Welcome");
			System.out.println("Please insert the name of Person 2:");
			
			String name2= keyboard.nextLine();
			
			System.out.println("Please insert the surname of Person 2:");
			String surname2= keyboard.nextLine();
			
			System.out.println("Please insert the city where Person 2 lives:");
			String city2= keyboard.nextLine();

			System.out.println("Please insert the street where Person 2 lives:");
			String street2= keyboard.nextLine();
			
			System.out.println("Please insert the city where Person 2 lives:");
			int num2= Integer.parseInt(keyboard.nextLine());
			
			Address address2 = new  Address (street2, num2, city2);
			
			p2= new Person (name2, surname2, address2);
			
			
			System.out.println("Here is the Person 1 you created");
			System.out.println(p1.getName());
			System.out.println(p1.getSurname());
			System.out.println(p1.getAddress().getCity());
			System.out.println(p1.getAddress().getStreet());
			System.out.println(p1.getAddress().getNum());

			System.out.println("Here is the Person 2 you created");
			System.out.println(p2.getName());
			System.out.println(p2.getSurname());
			System.out.println(p2.getAddress().getCity());
			System.out.println(p2.getAddress().getStreet());
			System.out.println(p2.getAddress().getNum());
			
			do
			{
				System.out.println("Would you like to change the home city of Person 1?");
				answer = keyboard.nextLine();
				
				if (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"))
					System.out.println("Wrong input: please put yes or no");
			}while(!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"));
			
			if (answer.equalsIgnoreCase("yes"))
			{
				System.out.println("Please input the new city for Person 1:");
				p1.getAddress().setCity(keyboard.nextLine());;
			}
			
			do
			{
				System.out.println("Would you like to change the home city of Person 2?");
				answer = keyboard.nextLine();
				
				if (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"))
					System.out.println("Wrong input: please put yes or no");
			}while(!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"));
			
			if (answer.equalsIgnoreCase("yes"))
			{
				System.out.println("Please input the new city for Person 2:");
				p2.getAddress().setCity(keyboard.nextLine());;
			}
			
			do
			{
				System.out.println("Would you like to create two new people?");
				
				repeat=keyboard.nextLine();
				
				if(!repeat.equalsIgnoreCase("yes") && !repeat.equalsIgnoreCase("no"))
					System.out.println("Wrong input. Please insert yes or no.");
				
			}while(!repeat.equalsIgnoreCase("yes") && !repeat.equalsIgnoreCase("no"));
			
			
			
		}while(repeat.equalsIgnoreCase("yes"));
		
		
		keyboard.close();
	}

}
