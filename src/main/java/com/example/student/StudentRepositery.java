package com.example.student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepositery extends JpaRepository<Student, Integer> {

	@Query(value = "select * from student where std=?", nativeQuery = true)

	public List<Student> getByGender(int a);

}
