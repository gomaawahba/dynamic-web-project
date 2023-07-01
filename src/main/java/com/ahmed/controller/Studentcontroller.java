package com.ahmed.controller;
import java.util.List;
import com.ahmed.DTO.StudentDTO;
import com.ahmed.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ahmed.DAO.StudentDAO;
@Controller
public class Studentcontroller {
	@Autowired
	private StudentDAO studentdao;
	@RequestMapping(value = "/showstudent",method = RequestMethod.GET)
	public String shoewStudent(ModelMap model) {
		List<Student> students=studentdao.getallStudent();
		for(Student st:students) {
			System.out.println(st);
			
		}
		model.addAttribute("students", students);
		return"student-lis";
	
	}
	@RequestMapping(value = "/addstudent",method = RequestMethod.GET)
	public String addStudent(ModelMap model) {
		StudentDTO studentDTO=new StudentDTO();
		model.addAttribute("students", studentDTO);
		return"add-student";
	
	}
	@RequestMapping(value = "/savestudent",method = RequestMethod.POST)
	public String saveStudent(Student student) {
		studentdao.savedStudent(student);
		return"redirect:/showstudent";
	
	}
	@RequestMapping(value = "/delet/{id}",method = RequestMethod.GET)
	public String deleteStudent(int id) {
		studentdao.delete(id);
		return"redirect:/showstudent";
	
	}

}
