import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ReadDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ReadDatabase.testDatabase();
	}
	
	public static void testDatabase() throws SQLException, ClassNotFoundException
	{
		Connection con = DriverManager.getConnection("192.168.2.15:3306/Livestable/yestogix_1april15","readonly","readonly");
		//Livestable/yestogix_1april15 - readonly@192.168.2.15
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Statement st = con.createStatement();
		
		System.out.println(st.executeQuery("SELECT * FROM agents WHERE codeNo='AGENT5196';"));
		
	}

}
