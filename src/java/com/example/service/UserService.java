package src.java.com.example.service;

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
