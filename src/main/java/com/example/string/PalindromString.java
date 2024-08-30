package com.example.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromString {

	public static void main(String[] args) {
		
//		System.out.println("Enter a String");
//		try (Scanner scanner = new Scanner(System.in)) {
//			String input = scanner.nextLine();
//			int length = input.length();
//
//			String reverse = "";
//			for(int i = length-1; i >= 0 ; i--) {
//				reverse = reverse + input.charAt(i);
//			}
//			
//			if (reverse.equals(input)) {
//				System.out.println("The String is Palindrom");
//			}else {
//				System.out.println("The String is Not Palindrom");
//				
//			}
//
//		}catch (Exception e) {
//		}

		List<String> names = Arrays.asList("Dinesh", "Rajesh", "Dipak", "vijesh", "omkar");
		 
		 List<String> findStartWithD =  names.stream().filter(n-> n.startsWith("D")).collect(Collectors.toList());
		 findStartWithD.forEach(System.out::println);
	}
	
	


}
