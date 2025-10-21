package com.example.demo.studentServiceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.ICourseDao;
import com.example.demo.request.CourseRequest;
import com.example.demo.response.CourseResponse;
import com.example.demo.response.StudentWithCoursesCount;
import com.example.demo.service.ICourseService;

@Service
public class CourseServiceImpl implements ICourseService {

	@Autowired
	private ICourseDao dao;
	
	@Override
	public CourseResponse insert(CourseRequest request) {
		return dao.createCourse(request);
	}

	@Override
	public List<CourseResponse> show() {
		return dao.showCourse();
	}

	@Override
	public List<CourseResponse> getCourses() {
		return dao.getCourses();
	}

	@Override
	public CourseResponse updateCourse(Integer id,String insctructor) {
		return dao.updateCourse(id,insctructor);
	}

	@Override
	public List<StudentWithCoursesCount> getStudentWithCourses() {
		return dao.getCoursesWithStudent();
	}

	@Override
	public List<StudentWithCoursesCount> topStudent(Integer n) {
		return dao.topStudents(n);
	}

}
