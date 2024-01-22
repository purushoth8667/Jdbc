package busresv;
import java.sql.*;

public class DbConnection {
	private static final String url = "jdbc:mysql://localhost:3306/jdbc";
	private static final String userName = "root";
	private static final String passWord = "2003";
	
	public static Connection getConnection() throws SQLException{
		return  DriverManager.getConnection(url,userName,passWord);
	}

}