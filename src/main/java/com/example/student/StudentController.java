package com.example.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.Exception.StandardException;

@RestController
public class StudentController {
	@Autowired
	StudentService studServ;

	@PostMapping(value = "addStudent")
	public String addStudent(@RequestBody Student a) {
		return studServ.addStudent(a);
	}

	@GetMapping(value = "get/{id}")
	public Student getStudent(@PathVariable int id) {

		return studServ.getStudent(id);
	}

	@PostMapping(value = "listAdd")
	public String addStudents(@RequestBody List<Student> a) {

		return studServ.addStudents(a);
	}

	@PutMapping(value = "update/{id}")
	public Student updateStudent(@RequestBody Student id) {

		return studServ.updateStudent(id);
	}

	@DeleteMapping(value = "/delete/{id}")
	public String deletStudent(@PathVariable int id) {

		return studServ.deleteStudent(id);
	}

	@GetMapping(value = "/getStudents")
	public List<Student> getStudents() {

		return studServ.getStudents();
	}

	@GetMapping(value = "/StudentsBySection/{sec}")
	public List<Student> studentBySections(@PathVariable char sec) {

		return studServ.studentBySection(sec);
	}

	@GetMapping(value = "/getByGender/{std}")
	public List<Student> getByGender(@PathVariable int std) throws StandardException {
		return studServ.getByGender(std);
	}

}
