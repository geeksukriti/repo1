package org.sukriti.oustlab.studentapi;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sukriti.oustlab.studentapi.dao.Student;
import org.sukriti.oustlab.studentapi.dao.StudentDaoImpl;


@Path("students")
public class MyResource {

    /*@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }*/
    
 
 @GET
 @Produces(MediaType.APPLICATION_JSON)
 public ArrayList<Student> dispStudent(){
     StudentDaoImpl dao = new StudentDaoImpl();
     ArrayList<Student> students = dao.getStudents();
     return students;
 }
}
