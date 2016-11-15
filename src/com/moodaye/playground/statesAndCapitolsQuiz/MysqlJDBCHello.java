package com.moodaye.playground.statesAndCapitolsQuiz;
import java.sql.*;

public class MysqlJDBCHello {

	public static void main(String[] args) {
		Connection con = null;
		try{
			String url = "jdbc:mysql://localhost/sales";
			String username = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, username, password);
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("Select * from product");
			while (rs.next()){
				System.out.println(rs.getInt("p_code") + "-" +
									rs.getString("p_name") + "-" +
									rs.getDouble("price") + "-" +
									rs.getDate("launch_dt") + "-" +
									rs.getString("p_descr"));
			}
		}
		catch (SQLException e){
			System.out.println(e);
		}
	}

}
