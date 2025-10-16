package com.example.demo.daoImpl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.dao.IStudentDao;
import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.repo.ICourseRepo;
import com.example.demo.repo.IStudentRepo;
import com.example.demo.request.StudentRequest;
import com.example.demo.response.StudentResponse;

@Repository
public class StudentDaoImpl implements IStudentDao {
    
	    @Autowired
	    private IStudentRepo studentRepo;

	    @Autowired
	    private ICourseRepo courseRepo;
	    
	  @Override
	  public StudentResponse createStudent(StudentRequest request) {
		    Student student = new Student();
		    student.setName(request.getName());
		    student.setEmail(request.getEmail());
		    student.setCity(request.getCity());

		    if (request.getCourseIds() != null) {
		        Set<Course> courses = new HashSet<>
		        (courseRepo.findAllById(request.getCourseIds()));
		        for (Course course : courses) {
		            student.addCourse(course);
		        }
		    }

		    Student savedStudent = studentRepo.save(student);

		    StudentResponse response = new StudentResponse();
		    response.setId(savedStudent.getId());
		    response.setName(savedStudent.getName());
		    response.setEmail(savedStudent.getEmail());
		    response.setCity(savedStudent.getCity());

		    Set<String> courseNames = new HashSet<>();
		    for (Course course : savedStudent.getCourses()) {
		        courseNames.add(course.getCourseName());
		    }
		    response.setCourses(courseNames);

		    return response;
	    
	}

	@Override
	public List<StudentResponse> showAllStudent() {
		List<Student> studentData = studentRepo.findAll();
		List<StudentResponse> stdResponse = new ArrayList<>();
		
		for (Student student : studentData) {
	        StudentResponse response = new StudentResponse();
	        response.setId(student.getId());
	        response.setName(student.getName());
	        response.setEmail(student.getEmail());
	        response.setCity(student.getCity());

	        Set<String> courseNames = new HashSet<>();
	        if (student.getCourses() != null) {
	            for (Course course : student.getCourses()) {
	                courseNames.add(course.getCourseName());
	            }
	        }

	        response.setCourses(courseNames);
	        stdResponse.add(response);
	    }

	    return stdResponse;
		
	}

	@Override
	public List<StudentResponse> getStudentByCourseName(String courseName) {
		Course course = courseRepo.findByCourseName(courseName);
        List<StudentResponse> responses = new ArrayList<>();

        if (course != null && course.getStudents() != null) {
            for (Student student : course.getStudents()) {
                StudentResponse response = new StudentResponse();
                response.setId(student.getId());
                response.setName(student.getName());
                response.setEmail(student.getEmail());
                response.setCity(student.getCity());

                Set<String> courseNames = new HashSet<>();
                if (student.getCourses() != null) {
                    for (Course c : student.getCourses()) {
                        courseNames.add(c.getCourseName());
                    }
                }

                response.setCourses(courseNames);
                responses.add(response);
            }
        }

        return responses;
    }

	@Override
	public List<StudentResponse> getStudentsWithoutCourse() {
		List<Student> students = studentRepo.findAll();
	    List<StudentResponse> responses = new ArrayList<>();

	    for (Student student : students) {
	        if (student.getCourses() == null || student.getCourses().isEmpty()) {
	            StudentResponse response = new StudentResponse();
	            response.setId(student.getId());
	            response.setName(student.getName());
	            response.setEmail(student.getEmail());
	            response.setCity(student.getCity());
	            response.setCourses(new HashSet<>());
	            responses.add(response);
	        }
	    }
	    return responses;
	}

	@Override
	public List<StudentResponse> searchStudentsByCityAndInstructor(String city, String instructor){
		
		return null;
	}

	@Override
	@Transactional
	public boolean updateInstructor(Long courseId, String newInstructor) {
		Course course = courseRepo.findById(courseId).get();
	    if (course != null) {
	        course.setInstructor(newInstructor);
	        courseRepo.save(course); 
	        return true;
	    }
	    return false;
	}
}
