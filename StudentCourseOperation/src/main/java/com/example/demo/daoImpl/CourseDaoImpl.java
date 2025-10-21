package com.example.demo.daoImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.dao.ICourseDao;
import com.example.demo.entity.Course;
import com.example.demo.repo.ICourseRepo;
import com.example.demo.request.CourseRequest;
import com.example.demo.response.CourseResponse;
import com.example.demo.response.StudentWithCoursesCount;

@Component
public class CourseDaoImpl implements ICourseDao {

	@Autowired
	private ICourseRepo repo;
	
	@Override
	public CourseResponse createCourse(CourseRequest request) {
		Course course = new Course();
		course.setCourseName(request.getCourseName());
		course.setInstructor(request.getInstructor());
		
		repo.save(course);
		CourseResponse response = new CourseResponse();
		response.setId(course.getId());
		response.setInstructor(course.getInstructor());
		response.setName(course.getCourseName());
		return response;
	}

	@Override
	public List<CourseResponse> showCourse() {
		List<Course> courses = repo.findAll();
		List<CourseResponse> courseResponse = new ArrayList<>();
		
		for(Course course : courses) {
			CourseResponse response = new CourseResponse();
			response.setId(course.getId());
			response.setInstructor(course.getInstructor());
			response.setName(course.getCourseName());
			courseResponse.add(response);
		}
		return courseResponse;
	}

	@Override
	public List<CourseResponse> getCourses() {
		List<CourseResponse> courseWithoutStudent = repo.findCourseWithoutStudent();
		List<CourseResponse> response = new ArrayList<>();
		
		for(CourseResponse course : courseWithoutStudent) {
			CourseResponse res = new CourseResponse();
			res.setId(course.getId());
			res.setInstructor(course.getInstructor());
			res.setName(course.getName());
			response.add(res);
		}
		return response;
	}

	@Override
	public CourseResponse updateCourse(Integer id,String instructor) {
		int updateCourse = repo.updateCourse(id, instructor);
		Course course = repo.findById(id).get();
		if(updateCourse>0) {
			CourseResponse response = new CourseResponse();
			response.setInstructor(course.getInstructor());
			repo.save(course);
			return response;
		}
		return null;
		
	}

	@Override
	public List<StudentWithCoursesCount> getCoursesWithStudent() {
		List<StudentWithCoursesCount> courseWithStudent = repo.getCourseWithStudent();
		List<StudentWithCoursesCount> response = new ArrayList<>();
		
		for(StudentWithCoursesCount course : courseWithStudent) {
			StudentWithCoursesCount res = new StudentWithCoursesCount();
			res.setCourseName(course.getCourseName());
			res.setId(course.getId());
			res.setInstructor(course.getInstructor());
			res.setTotalCounts(course.getTotalCounts());
			response.add(res);
		}
		return response;
	}

	@Override
	public List<StudentWithCoursesCount> topStudents(Integer n) {
		List<StudentWithCoursesCount> allCoursesWithStudentCount = repo.findAllCoursesWithStudentCount();
		int size = allCoursesWithStudentCount.size();
		
		if(n>size) {
			n = size;
		}
		List<StudentWithCoursesCount> course = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			StudentWithCoursesCount count = allCoursesWithStudentCount.get(i);
	        StudentWithCoursesCount response = new StudentWithCoursesCount();
			response.setCourseName(count.getCourseName());
			response.setId(count.getId());
			response.setInstructor(count.getInstructor());
			response.setTotalCounts(count.getTotalCounts());
		    course.add(response);
		}
		return course;
	}

}
