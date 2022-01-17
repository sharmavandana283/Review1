package com.Review1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.Review1.User;

public class UserReview {
	
	static Scanner sc = new Scanner(System.in);
	static List<User> UserList = new ArrayList<>(); 
	

	public static void main(String[] args) throws Exception {
		
		System.out.println("How many users you want to add : ");
		int i = sc.nextInt();
		for(int cnt=0;cnt<i;cnt++)
		{
		createUser();		 
		}
		
		List<User> sortedUserList = UserList.stream().sorted(Comparator.comparing(User::getFirstname)).collect(Collectors.toList());	
		
		System.out.println("Sorted UserList " + sortedUserList);
		
	}
	
	private static void createUser() throws Exception
	{
		System.out.println("First Name? ");
		String firstname = sc.nextLine();
		
		System.out.println("Last Name? ");
		String lastname = sc.nextLine();
		
		System.out.println("Address? ");
		String address = sc.nextLine();
		
		System.out.println("phoneNo? ");
		String phoneNo = sc.nextLine();		
			
		User User = new User(firstname,lastname,address,phoneNo);
		UserList.add(User);
		
		System.out.println("Added User: " + User);
	}
	
}
