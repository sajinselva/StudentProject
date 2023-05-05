package com.example.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepositery studRep;

	public String addStudent(Student a) {
		studRep.save(a);
		return "Succesfully Added";
	}

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return studRep.findById(id).get();

	}

	public String addStudents(List<Student> a) {
		// TODO Auto-generated method stub
		studRep.saveAll(a);
		return "Add Students Successfully";
	}

	public Student updateStudent(Student id) {
		// TODO Auto-generated method stub
		return studRep.save(id);
	}

	public String deletStudent(int id) {
		studRep.deleteById(id);
		return "Deleted Successfully";
	}

	public List<Student> getStudents() {

		return studRep.findAll();

	}

	public List<Student> getByGender(int std) {

		return studRep.getByGender(std);
	}

}
