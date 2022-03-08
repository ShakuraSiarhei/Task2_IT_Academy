package by.academy.shakuro.string;

import java.util.Scanner;

public class Task105 {

	public static void main(String[] args) {
		
		String str = readText();
		
		String resultEncrypted = encrypt(str);		
		String resultDecoded = decrypt(resultEncrypted);
		
		showResults(resultEncrypted, resultDecoded);
		
	}
	
	public static String readText() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите текст для шифрования: ");
		String textForEncryption = sc.nextLine();
		
		return textForEncryption;
	}

	public static String encrypt(String str) {
		char[] ch = new char[str.length()];
		String str1 = str.substring(0, str.length() / 2);
		String str2 = str.substring(str.length() / 2);
		String resultEncrypted;
		int count = 0;
		
		for (int i = 0; i < ch.length; i++) {
			if (i == ch.length - 1 && ch.length % 2 != 0) {
				ch[i] = str2.charAt(count);
			} else {
			ch[i] = str1.charAt(count);
			i++;
			ch[i] = str2.charAt(count);
			count++;
			}
		}
		
		resultEncrypted = new String(ch);
		
		return resultEncrypted;
	
	}
	
	public static String decrypt(String str) {
		
		String resultDecrypted;
		char[] ch = new char[str.length()];
		int count = 0;
		
		for (int i = 0; i < ch.length / 2; i++) {
			ch[i] = str.charAt(count);
			count++;
			ch[i + ch.length / 2] = str.charAt(count);
			count++;
		}
		
		if (ch.length % 2 != 0) {
			ch[ch.length - 1] = str.charAt(count);
		}
		
		resultDecrypted = new String(ch);
		
		return resultDecrypted;
	
	}
	
	public static void showResults(String str1, String str2) {
		
		System.out.println("Зашифрованный текст: " + str1);
		System.out.println("Исходный текст: " + str2);
	
	}
	
}
