package com.ahmed.DTO;

public class StudentDTO {
	private int id=1000;
	private int Student_id=1000;
	private String name="gomaa wahba";
	private int age=80;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", Student_id=" + Student_id + ", name=" + name + ", age=" + age + "]";
	}
	

}
