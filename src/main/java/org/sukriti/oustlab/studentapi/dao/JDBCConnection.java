package org.sukriti.oustlab.studentapi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    
	private static JDBCConnection inst;
	private Connection con;
	static final String pass="web1234";
	static final String user="web";
	
	private JDBCConnection() throws SQLException {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:mydb",user,pass);
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println(ex);
		}
	}
	
	public static JDBCConnection getInstance() throws SQLException
	{
		if(inst==null)
		{
			inst=new JDBCConnection();
		}
		 else if (inst.getConnection().isClosed()) 
		 {
	            inst = new JDBCConnection();
		 }
		return inst;
	}
	
	public Connection getConnection()
	{
		return con;
	}
}
