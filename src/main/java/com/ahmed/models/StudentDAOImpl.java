package com.ahmed.models;

import java.util.List;
import com.ahmed.rowmapper.StudentRowmapper;

import javax.activation.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ahmed.DAO.StudentDAO;

public class StudentDAOImpl implements StudentDAO {
	private JdbcTemplate jdbctemplet;
	
	public StudentDAOImpl(DataSource datasource) {
		jdbctemplet=new JdbcTemplate((javax.sql.DataSource) datasource);
	}

	@Override
	public List<Student> getallStudent() {
		String sql="SELECT * FROM students";
		List<Student> students=jdbctemplet.query(sql, new StudentRowmapper() );
		return null;
	}

	@Override
	public void savedStudent(Student student) {
		Object[] object={
			student.getId(),student.getStudent_id(),student.getName(),student.getAge()
			
		};
		String sql="INSERT INTO `students`(`id`, `student_id`, `name`, `age`) VALUES (?,?,?,?)";
		jdbctemplet.update(sql, object);
		System.out.println("inserted");
		
		
		
		//INSERT INTO `students`(`id`, `student_id`, `name`, `age`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]')
		

	}

	@Override
	public Student gatStudentbuid(int id) {
		String sql="SELECT `id`, `student_id`, `name`, `age` FROM `students` WHERE `id=?`";
	      return 	jdbctemplet.queryForObject(sql,new Object[] {id}, new StudentRowmapper());
		
	}

	@Override
	public int delete(int id) {
		String sql="DELETE FROM `students` WHERE `id=`"+id;
		return jdbctemplet.update(sql);
	}

}
