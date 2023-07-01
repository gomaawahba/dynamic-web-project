package com.ahmed.DAO;
import java.util.List;
import com.ahmed.models.Student;
public interface StudentDAO {
	List<Student>getallStudent();
	void savedStudent(Student student);
	Student gatStudentbuid(int id);
	int delete(int id);
	

}
