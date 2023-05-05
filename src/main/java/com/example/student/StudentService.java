package com.example.student;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.Exception.StandardException;

@Service
public class StudentService {
	@Autowired
	StudentDao studDao;

	public String addStudent(Student a) {
		return studDao.addStudent(a);
	}

	public Student getStudent(int id) {
		return studDao.getStudent(id);
	}

	public String addStudents(List<Student> a) {

		return studDao.addStudents(a);
	}

	public Student updateStudent(Student id) {

		return studDao.updateStudent(id);
	}

	public String deleteStudent(int id) {

		return studDao.deletStudent(id);
	}

	public List<Student> getStudents() {

		return studDao.getStudents();

	}

	public List<Student> studentBySection(char sec) {

		return studDao.getStudents().stream().filter(x -> x.getSec() == sec).collect(Collectors.toList());
	}

	public List<Student> getByGender(int std) throws StandardException {
		if (studDao.getByGender(std).isEmpty()) {
			throw new StandardException();
		} else {

			return studDao.getByGender(std);
		}
	}

}
