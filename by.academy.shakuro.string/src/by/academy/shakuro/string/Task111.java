package by.academy.shakuro.string;

import java.util.Scanner;

public class Task111 {

	public static void main(String[] args) {
		
		String [] arrNames = readText();
		
		changeNames(arrNames);
		
		showResults(arrNames);
		
	}
	
	public static String[] readText() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¬ведите названи€ переменных в camelCase (через пробел): ");
		String names = sc.nextLine();
		String [] arrNames = names.split(" ");
		
		return arrNames;
	}
	
	public static void changeNames(String[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				
				if (Character.toUpperCase(arr[i].charAt(j)) == arr[i].charAt(j)) {
					arr[i] = arr[i].substring(0, j) + "_" + Character.toLowerCase(arr[i].charAt(j)) + arr[i].substring(j+1);
				}
			}
		}
	}
	
	public static void showResults(String[] arr) {
		
		for (String s : arr) {
			System.out.print(s + " ");
		}
	}
}
