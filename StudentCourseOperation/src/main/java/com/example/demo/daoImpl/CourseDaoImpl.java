package com.example.demo.daoImpl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.ICourseDao;
import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.repo.ICourseRepo;
import com.example.demo.response.CourseResponse;
import com.example.demo.response.CourseResponseDTO;
import com.example.demo.response.CourseStudentDTOCount;

@Repository
public class CourseDaoImpl implements ICourseDao {
    
	@Autowired
	private ICourseRepo courseRepo;
	
	@Override
	public boolean updateInstructor(Long courseId, String newInstructor) {
		Course course = courseRepo.findById(courseId).orElse(null);
	    if (course != null) {
	        course.setInstructor(newInstructor);
	        courseRepo.save(course); // update in DB
	        return true;
	    }
	    return false;
	}

	@Override
	public List<CourseResponse> getCoursesWithStudentCount() {
		List<Course> courses = courseRepo.findAll(); // sabhi courses fetch karo
        List<CourseResponse> result = new ArrayList<>();

        for (Course c : courses) {
            CourseResponse response = new CourseResponse();
            response.setId(c.getId());
            response.setCourseName(c.getCourseName());
            response.setInstructor(c.getInstructor());

            // Student count calculate karna (easy for-loop)
            int count = 0;
            if (c.getStudents() != null) {
                for (Student s : c.getStudents()) {
                    count++; // har student ke liye count increment
                }
            }
            response.setTotalStudents(count);

            // Response list me add karo
            result.add(response);
        }

        return result;
	}

	

	@Override
	public List<CourseResponseDTO> findCourseWithoutStudent() {
		// TODO Auto-generated method stub
		return courseRepo.findCourseWithoutStudent();
	}

}
