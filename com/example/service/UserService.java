package com.example.service;

/**
 * PackageName : com.example.service
 * FileName    : UserService
 * Author      : sangxxjin
 * Date        : 2025. 4. 8.
 * Description : 
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 4. 8.     sangxxjin               Initial creation
 */
public class UserService {

	public String getUserNameById(int userId) {
		if (userId == 1) {
			return "Alice";
		} else if (userId == 2) {
			return "Bob";
		} else {
			return null;
		}
	}

	public void printUserName(int userId) {
		String name = getUserNameById(userId);
		System.out.println("User name is " + name.toUpperCase()); // NPE 가능성 있음
	}
}