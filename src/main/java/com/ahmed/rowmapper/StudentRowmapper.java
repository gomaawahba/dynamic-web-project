package com.ahmed.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ahmed.models.Student;

public class StudentRowmapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student=new Student();
		student.setName(rs.getString("name"));
		student.setId(rs.getInt("id"));
		student.setStudent_id(rs.getInt("student_id"));
		student.setAge(rs.getInt("age"));
		return null;
	}

}
