package com.example.demo.studentServiceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICourseDao;
import com.example.demo.response.CourseResponse;
import com.example.demo.response.CourseResponseDTO;
import com.example.demo.response.CourseStudentDTOCount;
import com.example.demo.service.ICourseService;

@Service
public class CourseServiceImpl implements ICourseService {
    
	@Autowired
	private ICourseDao courseDao;
	
	@Override
	public boolean updateInstructor(Long courseId, String newInstructor) {
		return courseDao.updateInstructor(courseId, newInstructor);
	}

	@Override
	public List<CourseResponse> getCoursesWithStudentCount() {
		return courseDao.getCoursesWithStudentCount();
	}

	@Override
	public List<CourseResponseDTO> getCourseWithoutStudent() {
		return courseDao.findCourseWithoutStudent();
	}

	@Override
	public List<CourseStudentDTOCount> getCountStudentEachCourse() {
		return null;
	}

}
