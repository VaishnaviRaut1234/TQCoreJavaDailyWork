package com.university.doaimpl;

import java.util.ArrayList;
import java.util.Scanner;

import com.university.dao.StudentDao;
import com.university.model.Course;
import com.university.model.Student;
import com.university.model.University;

public class StudentDaoImpl implements StudentDao {
	
	static Scanner sc= new Scanner(System.in);
	
	ArrayList<Student> studs;

	@Override
	public void addStudent(University u, Student s) {

      studs= u.getStud();
      studs.add(s);
      u.setStud(studs);
      
      System.out.println("Student added..............");
		
	}

	@Override
	public void deleteStudent(University u, int id) 
	{
	
		for (int i = 0; i < studs.size(); i++) {
			if (studs.get(i).getSid() == id) {
				studs.remove(i);
				System.out.println("Student deleted successfully.....");
			} 
			else 
			{
				System.out.println("Student not founds...");

			}

		}
		
	}

	@Override
	public void updateStudent(University u, int id) 
	{
		
		
		for (int i = 0; i < studs.size(); i++) {
			if (studs.get(i).getSid() == id) {
				System.out.print("Enter Student Id: ");
				studs.get(i).setSid(sc.nextInt());
				System.out.print("Enter Student Name: ");
				studs.get(i).setName(sc.next());
				System.out.println("Enter 12th standard percentage:");
				studs.get(i).setSpercent(sc.nextDouble());
				System.out.println("Course updated successfully.");

				System.out.println("Student added..............");
			}
		}
			
	}

	@Override
	public Student viewStudentBy(University u, int id) 
	{
		
		for (Student s : u.getStud()) {
			if (s.getSid() == id) {
				System.out.println("Student ID:-" + s.getSid() + "\nStudent Name:- " + s.getName()
						+ "\nStudent Percentage:- " + s.getSpercent());

			}
		}
		return null;
	}

	@Override
	public void displayAllStudent(University u) {

       for(Student s: u.getStud())
       {
    	   System.out.println(s);
       }
		
	}

	@Override
	public void displayStudentByCourse(University u, String course) {
		// TODO Auto-generated method stub
		
		for (Course c : u.getCs()) {
			if (c.getCname() == course) 
			{
				System.out.println("Course ID:-" + c.getCid() + "\nCourse Name:- " + c.getCname() + "\nCourse Fee:- "
						+ c.getFees());

			}
		}
		
	}

}
