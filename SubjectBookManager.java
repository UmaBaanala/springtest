package com.demo;
import java.util.Scanner;

import com.demo.service.SubjectBookService;
import com.demo.util.AppContextUtil;

public class SubjectBookManager {

	public static void main(String[] args) {     
		System.out.println("Enter your option: betwwen a and f");
		System.out.println("a : addBook");
		System.out.println("b: delete subject ");
		System.out.println("c : Delete a book ");
		System.out.println("d : Search for a book");
		System.out.println("e: search for subject");
		System.out.println("f: exit ");
		//System.out.println("g: add subject ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		String option = scanner.next();
		implmentOption(option);	
	}
	public static void implmentOption(String option) {
		AppContextUtil util = new AppContextUtil();
		SubjectBookService service = (SubjectBookService)util.getBean("subjectBookService");

		switch (option) {
		case "a":
			service.addBook();
			break;
		case "b":
			service.deleteSubject();
			break;
		case "c":
			service.deleteBook();
			break;
		case "d":
			service.searchForBook();
			break;
		case "e":
			service.searchSubject();
			break;	
		case "f":
			System.out.println("Exiting the application...");
			System.exit(0);	
		/*case "g":
			service.addSubject();
			break;*/
		default:
			System.out.println("Please provide a valid option a..f");
			System.exit(1);
		}

	}

}
