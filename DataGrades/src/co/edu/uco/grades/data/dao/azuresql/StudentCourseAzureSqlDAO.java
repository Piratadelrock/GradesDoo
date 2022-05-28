package co.edu.uco.grades.data.dao.azuresql;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.grades.data.dao.SessionDAO;
import co.edu.uco.grades.data.dao.StudentCourseDAO;
import co.edu.uco.grades.data.dao.connection.ConnectionSQL;
import co.edu.uco.grades.dto.StudentCourseDTO;

public class StudentCourseAzureSqlDAO  extends ConnectionSQL implements StudentCourseDAO {

	protected StudentCourseAzureSqlDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}
	public static StudentCourseDAO build(Connection connection) {
		return new StudentCourseAzureSqlDAO(connection);
	}
	@Override
	public void create(StudentCourseDTO student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(StudentCourseDTO student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<StudentCourseDTO> find(StudentCourseDTO student) {
		// TODO Auto-generated method stub
		return null;
	}

}
