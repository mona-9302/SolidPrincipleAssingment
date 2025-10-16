package com.example.demo.studentServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.IStudentDao;
import com.example.demo.request.StudentRequest;
import com.example.demo.response.StudentResponse;
import com.example.demo.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
    
	@Autowired
	private IStudentDao studentDao;
	
	@Override
	public StudentResponse insert(StudentRequest request) {
		return studentDao.createStudent(request);
	}

	@Override
	public List<StudentResponse> showStudent() {
		return studentDao.showAllStudent();
	}

	@Override
	public List<StudentResponse> getStudentsByCourseName(String courseName) {
		return studentDao.getStudentByCourseName(courseName);
	}

	@Override
	public List<StudentResponse> getStudentsWithoutCourse() {
		return studentDao.getStudentsWithoutCourse();
	}


}
