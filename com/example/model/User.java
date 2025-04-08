package com.example.model;

/**
 * PackageName : com.example.model
 * FileName    : User
 * Author      : sangxxjin
 * Date        : 2025. 4. 8.
 * Description : 
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 4. 8.     sangxxjin               Initial creation
 */

public class User {
	private Long id;
	private String name;
	private String email;
	private int age;

	public User(Long id, String name, String email, int age) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public boolean isAdult() {
		return age >= 18;
	}

	//코드리뷰 setter지적
	public void updateName(String newName) {
		this.name = name;
	}

	// 코드리뷰 getter 지적
	public String getEmail() {
		return email;
	}
}
