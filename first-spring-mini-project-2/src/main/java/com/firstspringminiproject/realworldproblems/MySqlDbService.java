package com.firstspringminiproject.realworldproblems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySqlDbService implements DataService {

	@Override
	public List<Integer> retrieval() {
		List<Integer> result = new LinkedList<>();
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/springDb", "root", "Ch3math@123");
			ResultSet resultSet = conn.prepareStatement("select age from testtable").executeQuery();
			while(resultSet.next()){
				result.add(resultSet.getInt(1));
			}
			return result;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
