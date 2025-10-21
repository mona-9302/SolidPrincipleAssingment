package com.example.demo.studentServiceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IStudentDao;
import com.example.demo.request.StudentRequest;
import com.example.demo.response.StudentCountResponse;
import com.example.demo.response.StudentCourseResponse;
import com.example.demo.response.StudentNotCourseResponse;
import com.example.demo.response.StudentResponse;
import com.example.demo.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
    private IStudentDao dao;
	
	@Override
	public StudentResponse insert(StudentRequest request) {	
		return dao.insert(request);
	}

	@Override
	public List<StudentResponse> showStudent() {
		return dao.showStudents();
	}

	@Override
	public List<StudentCourseResponse> showStudentByCourseName(String name) {
		return dao.findStudentByCourseName(name);
	}

	@Override
	public List<StudentCountResponse> getStudentCount() {
		return dao.getStudentCount();
	}

	@Override
	public List<StudentNotCourseResponse> getStudentNotEnroll() {
		return dao.getNotEnrollStudent();
	}

	@Override
	public List<StudentNotCourseResponse> searchStudent(String city, String instructor) {
		return dao.searchStudent(city,instructor);
	}

}
