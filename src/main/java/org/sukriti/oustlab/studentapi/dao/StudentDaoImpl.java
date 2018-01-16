package org.sukriti.oustlab.studentapi.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.List;


public class StudentDaoImpl {
	
public StudentDaoImpl()
{}


public ArrayList<Student> getStudents() 
{
	  /* Student s1=new Student("Sukriti","9044717837","Varanasi","India",101);
	   List<Student> students= new ArrayList<>();
	   students.add(s1);
	   return students;*/
	    Connection con=null;
	    Statement stmt=null;
	    Student stud = new Student();
	    ArrayList<Student> students= new ArrayList<Student>();  
	    
	    try
	    {
	      ResultSet  rs;
	      JDBCConnection inst= JDBCConnection.getInstance();
	      con= inst.getConnection(); 
	      stmt=con.createStatement();
	      String query = "SELECT * FROM STUDENT";
	      rs = stmt.executeQuery(query);
	      
	      System.out.println(rs);
	      while(rs.next())
	      {
	        stud.setId(rs.getInt(1));
	        stud.setName(rs.getString(2));
	        stud.setCity(rs.getString(3));
	        stud.setCountry(rs.getString(4));
	        stud.setMobile(rs.getString(5));
	        students.add(stud);
	      }
	    }
	    catch (SQLException e)
	    {
	      e.printStackTrace();
	    }
	    
	    finally
	    {
	      if(con != null) 
	    	  try { 
	    		  stmt.close();
	    		  con.close(); 
	    		  } 
	      catch (SQLException e) 
	             { 
	    	  e.printStackTrace(); 
	    	     }
	     }
	     
	     
	    return students;
   }

}
/*public void updateStudent()
{
}

public void deleteStudent()
{
}
*/

    


