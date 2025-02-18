package second_project;

import java.sql.Connection;
import java.sql.DriverManager;

public class mkkl {
	public static void main(String[] args)throws ClassNotFoundException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mas", "root", "898977");
			System.out.println("created connection");
			
			
			
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
