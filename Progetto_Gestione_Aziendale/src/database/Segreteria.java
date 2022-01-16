package database;

public class Segreteria {
	public static String createID(String name, String surname, int year) {
		return name.substring(0,2) + surname.substring(0,2) + year;
	}
}
