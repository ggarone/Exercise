package view;

import java.util.Scanner;

import controller.Azienda;
import model.Impiegato;


public class AziendaDemo {

	public static void main(String[] args) {
		final int impiegatiMax = 50; 
		Azienda azienda = new Azienda(impiegatiMax);
		
//		for (int i = 0; i < impiegatiMax; i++) {
//			String name = getUserInput();
//			String surname = getUserInput();
//			int yearOfBirth = getUserInputInt();
//			int salary = getUserInputInt();
//			String id = Segreteria.createID(name, surname, yearOfBirth);
//			Impiegato i1 = new Impiegato(name, surname, id,yearOfBirth, salary);
//		}
		
		Impiegato i1 = new Impiegato("Giuseppe", "Garone", 1995, 20000);
		Impiegato i2 = new Impiegato("Winny", "Pooh", 1984, 45000);
		Impiegato i3 = new Impiegato("Bill", "Gates", 1948, 200000);
		azienda.addImpiegato(i1);
		azienda.addImpiegato(i2);
		azienda.addImpiegato(i3);
		
		System.out.println("Total salary of the company is: " + azienda.totalSalary());

	}
	
	private static Integer getUserInputInt() {
		Integer userChoice;
		System.out.print("Input number: \n>> ");
		Scanner sc = new Scanner(System.in);
		userChoice = sc.nextInt();
		sc.close();
		return userChoice;
	}
	
	private static String getUserInput() {
		String userChoice;
		System.out.print("Input number: \n>> ");
		Scanner sc = new Scanner(System.in);
		userChoice = sc.nextLine();
		sc.close();
		return userChoice;
	}

}
