package getter;

import java.sql.*;

public class Getter {

	public static void main(String[] args) throws Exception {
		String db = "";
		String query = "";
		System.out.println("Connection to database...");
		Connection connector = null;
		Statement stmt = null;
		connector = DriverManager.getConnection("jdbc:odbc:" + db);
		stmt = connector.createStatement();
		
		//query = "SELECT * FROM mytable";
		ResultSet result = stmt.executeQuery(query);
		while(result.next()) {
			//gets whatever is in column index 1 and proceeds to next row
			System.out.println(result.getString(1));
		}
		
	}
}
