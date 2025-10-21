package com.example.demo.daoImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;import org.hibernate.tool.schema.extract.internal.SequenceInformationExtractorTiDBDatabaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.dao.IStudentDao;
import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.repo.ICourseRepo;
import com.example.demo.repo.IStudentRepo;
import com.example.demo.request.StudentRequest;
import com.example.demo.response.StudentCountResponse;
import com.example.demo.response.StudentCourseResponse;
import com.example.demo.response.StudentNotCourseResponse;
import com.example.demo.response.StudentResponse;
import jakarta.transaction.Transactional;

@Component
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private IStudentRepo repo;
	
	@Autowired
	private ICourseRepo courseRepo;
	
	@Override
	@Transactional
	public StudentResponse insert(StudentRequest request) {
		Student student = new Student();
		student.setCity(request.getCity());
		student.setEmail(request.getEmail());
		student.setName(request.getName());
		
		List<Course> course = new ArrayList<>();
		List<Course> allById = courseRepo.findAllById(request.getId());
		
		for(Course ids : allById) {
			student.setCourses(ids);
		}
		
		Student save = repo.save(student);
		StudentResponse response = new StudentResponse();
		response.setCity(student.getCity());
		response.setEmail(student.getEmail());
		response.setName(student.getName());
	    
		return response;
	}

	@Override
	public List<StudentResponse> showStudents() {
	    List<Student> students = repo.findAll();
	    List<StudentResponse> stdData = new ArrayList<>();

	    for (Student s : students) {
	    	StudentResponse response = new StudentResponse();
	        response.setId(s.getId());
	        response.setName(s.getName());
	        response.setEmail(s.getEmail());
	        response.setCity(s.getCity());
	        response.setCourseName(repo.findAllCourseName(s.getId()));
	        stdData.add(response);
	    }

	    return stdData;
	}

	@Override
	public List<StudentCourseResponse> findStudentByCourseName(String name) {
		List<StudentCourseResponse> studentsByCourseName = repo.findStudentsByCourseName(name);
		List<StudentCourseResponse> response = new ArrayList<>();
		
		for(StudentCourseResponse std : studentsByCourseName) {
			StudentCourseResponse res = new StudentCourseResponse();
			res.setId(std.getId());
			res.setName(std.getName());
			response.add(res);
		}
		return response;
	}

	@Override
	public List<StudentCountResponse> getStudentCount() {
		List<StudentCountResponse> studentCount = repo.getStudentCount();
		List<StudentCountResponse> response = new ArrayList<>();
		
		for(StudentCountResponse res : studentCount) {
			StudentCountResponse count = new StudentCountResponse();
			count.setId(res.getId());
			count.setCourseName(res.getCourseName());
			count.setTotalCounts(res.getTotalCounts());
			response.add(res);
		}
		return response;
	}

	@Override
	public List<StudentNotCourseResponse> getNotEnrollStudent() {
		List<StudentNotCourseResponse> notEnrolledStudent = repo.getNotEnrolledStudent();
		List<StudentNotCourseResponse> response = new ArrayList<>();
		
		for(StudentNotCourseResponse student : notEnrolledStudent) {
			StudentNotCourseResponse res = new StudentNotCourseResponse();
			res.setCity(student.getCity());
			res.setEmail(student.getEmail());
			res.setName(student.getName());
			res.setId(student.getId());
			response.add(res);
		}
		return response;
	}

	@Override
	public List<StudentNotCourseResponse> searchStudent(String city, String instructor) {
		List<StudentNotCourseResponse> searchStudent = repo.searchStudent(city, instructor);
		List<StudentNotCourseResponse>response = new ArrayList<>();
		
		for(StudentNotCourseResponse res : searchStudent) {
			StudentNotCourseResponse student = new StudentNotCourseResponse();
			student.setCity(res.getCity());
			student.setEmail(res.getEmail());
			student.setId(res.getId());
			student.setName(res.getName());
			response.add(student);
		}
		return response;
	}

}
